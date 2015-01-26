package jambda.lang.handler;

import jambda.lang.exception.DuplicateMethodException;
import jambda.lang.exception.DuplicateVariableException;
import jambda.lang.exception.IllegalSymbolException;
import jambda.lang.symbol.Scope;
import jambda.lang.symbol.Symbol;

/**
 * Created by Hakan on 1/16/2015.
 */
public class ExceptionTracker {

    // show user our runtime exceptions
    public static void throwEx(Symbol symbol, Scope scope, Error errorLevel) {
        switch (errorLevel) {
            case METHOD:
                throw new DuplicateMethodException(symbol.toString() + " already defined in " + scope.getScopeName());
            case VARIABLE:
                throw new DuplicateVariableException(symbol.toString() + " already defined in " + scope.getScopeName());
            case TYPE:
                throw new IllegalSymbolException("Cannot set the build-in unites as member names! : " + symbol.toString());
        }
    }
}
