package jambda.lang.aspects;

import jambda.lang.symbol.Scope;
import jambda.lang.symbol.Symbol;
/**
 * This is just a teeny tiny aspect module to help in loading the basic settings of the two system classes : Symbol & Scope
 *
 * Created by Hakan on 1/20/2015.
 */
privileged public aspect SystemLoadAspect {

    pointcut getConstructorsScope(Scope scope) : execution(Scope.new(..)) && this(scope);

    after(Scope scope) : getConstructorsScope(scope){
        scope.initTypeSystem();
        scope.setAddress();
    }

    pointcut getConstructorsSymbol(Symbol symbol) : execution(Symbol.new(..)) && this(symbol);

    after(Symbol symbol) : getConstructorsSymbol(symbol){
        symbol.setAddress();
    }

}
