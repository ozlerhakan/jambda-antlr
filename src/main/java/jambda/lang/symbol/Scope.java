package jambda.lang.symbol;

import jambda.lang.handler.*;
import jambda.lang.handler.Error;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Created by Hakan on 1/12/2015.
 */
public abstract class Scope implements Scopeable {

    protected Map<String, Symbol> symbolTable = new HashMap<>();
    // null means that we are in the global scope
    private Optional<Scope> enclosingScope;
    private int address;

    public Scope() {
        setEnclosingScope(Optional.empty());
    }

    public Scope(Scope enclosingScope) {
        setEnclosingScope(Optional.of(enclosingScope));
    }

    // So developer cannot type any of these types otherwise return exception
    protected void initTypeSystem() {
        if (!(this instanceof GlobalScope))
            return;
        define(new BuiltInTypeSymbol("integer", "int", "Integer"));
        define(new BuiltInTypeSymbol("double", "double", "Double"));
        define(new BuiltInTypeSymbol("character", "char", "Character"));
        define(new BuiltInTypeSymbol("boolean", "boolean", "Boolean"));
        define(new BuiltInTypeSymbol("string", "String", "String"));
        define(new BuiltInTypeSymbol("arrayList", "ArrayList", "ArrayList"));
        define(new BuiltInSystemMethod("println", "System.out.println"));
        define(new BuiltInSystemMethod("print", "System.out.print"));
    }

    @Override
    public  Map<String, Symbol> getSymbolTable(){
        return symbolTable;
    }

    @Override
    public void setAddress() {
        address = this.hashCode();
    }

    @Override
    public String getAddress() {
        return String.valueOf(address);
    }

    @Override
    public Optional<Scope> getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void setEnclosingScope(Optional<Scope> nestingScope) {
        this.enclosingScope = nestingScope;
    }

    @Override
    public void define(Symbol symbol) {
        Optional<Symbol> parent;

        if (symbol.getSymbolType().equals("method")) {
            parent = resolve(symbol.getPrefixName());
            parent.filter(s -> s instanceof BuiltInSystemSymbol)
                    .ifPresent(sym -> ExceptionTracker.throwEx(symbol, this, jambda.lang.handler.Error.TYPE));
        }

        parent = resolve(symbol.getSymbolName());
        parent.filter(s -> s instanceof BuiltInSystemSymbol)
                .ifPresent(s -> ExceptionTracker.throwEx(symbol, this, Error.TYPE));

        parent.filter(s -> s.getInScope().equals(this))
                .map(s -> s instanceof VariableSymbol)
                .ifPresent(b -> ExceptionTracker.throwEx(symbol, this, Error.VARIABLE));

        parent.filter(s -> s.getInScope().equals(this))
                .filter(s -> s instanceof MethodSymbol)
                .ifPresent(sym -> {
                    MethodSymbol existM = (MethodSymbol) sym;
                    MethodSymbol currentM = (MethodSymbol) symbol;

                    if (isNull(existM.getSignature()) && isNull(currentM.getSignature())) {
                        ExceptionTracker.throwEx(symbol, this, Error.METHOD);
                    }
                    if (nonNull(existM.getSignature()) && nonNull(currentM.getSignature())) {
                        if (Objects.equals(currentM.getSignature(), existM.getSignature()))
                            ExceptionTracker.throwEx(symbol, this, Error.METHOD);
                    }
                });

        symbol.setInScope(this); // track the scope in each symbol
        symbolTable.put(symbol.getSymbolName(), symbol);
    }

    @Override
    public Optional<Symbol> resolve(String name) {
        Optional<Symbol> symbol = Optional.ofNullable(symbolTable.get(name));
        if (symbol.isPresent())
            return symbol;

        // if not here, check whether any enclosing scope exist or not
        if (getEnclosingScope().isPresent())
            return getEnclosingScope().get().resolve(name);

        // if we reach here, this symbol does not exist in the scopes
        return Optional.empty();
    }

    /**
     * In order to include unique system types (e.g. integer, string) and system methods (e.g. print, println)
     */
    protected class BuiltInSystemSymbol extends Symbol {
        public BuiltInSystemSymbol(String name, String type, String typeClass) {
            super(name, type, typeClass);
        }

        public BuiltInSystemSymbol(String name, String type) {
            super(name, type);
        }
    }

    protected class BuiltInSystemMethod extends BuiltInSystemSymbol {
        public BuiltInSystemMethod(String name, String type) {
            super(name, type);
        }
    }

    protected class BuiltInTypeSymbol extends BuiltInSystemSymbol {
        public BuiltInTypeSymbol(String name, String type, String typeClass) {
            super(name, type, typeClass);
        }
    }
}
