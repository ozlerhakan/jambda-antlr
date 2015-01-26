package jambda.lang.symbol;

import java.util.Map;
import java.util.Optional;

/**
 * Created by Hakan on 1/12/2015.
 */
public interface Scopeable {

    String getScopeName();

    Optional<Scope> getEnclosingScope();

    void setEnclosingScope(Optional<Scope> scope);

    void define(Symbol sym);

    Optional<Symbol> resolve(String name);

    Map<String, Symbol> getSymbolTable();

    void setAddress();

    String getAddress();

}
