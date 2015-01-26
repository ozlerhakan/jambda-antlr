package jambda.lang.symbol;

import jambda.lang.exception.DuplicateNameException;

import java.util.*;

/**
 * Created by Hakan on 1/12/2015.
 */
public class MethodSymbol extends Symbol {

    // the method argument signatures
    // to check their signatures whether duplicate or overloaded methods
    private ArrayList<String> signature;
    // list of arguments it has
    private Map<String, Symbol> arguments;

    public MethodSymbol(String name, String type) {
        super(name, type);
    }

    public ArrayList<String> getSignature() {
        return signature;
    }

    public Map<String, Symbol> getArguments() {
        return arguments;
    }

    public void addParam(String key, String value) {
        if (Objects.isNull(arguments))
            arguments = new HashMap<>();
        else {
            Optional<Symbol> symbol = Optional.ofNullable(arguments.get(key));
            symbol.ifPresent((sym) -> {
                throw new DuplicateNameException(String.join(" ",sym.toString(), "in", super.getSymbolName()));
            });
        }

        if (Objects.isNull(signature))
            signature = new ArrayList<>();

        VariableSymbol var = new VariableSymbol(key, value);
        var.setLineNumber(getLineNumber());
        arguments.put(key, var);
        signature.add(value);
    }

    @Override
    public String getSymbolName() {
        StringBuilder sb = new StringBuilder(super.getSymbolName());
        StringJoiner sj = new StringJoiner(",");
        sb.append("[");
        if (Objects.nonNull(signature))
            signature.forEach(sj::add);
        sb.append(sj);
        sb.append("]");
        return sb.toString();
    }
}
