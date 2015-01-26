package jambda.lang.symbol;

/**
 * Created by Hakan on 1/12/2015.
 */
public class GlobalScope extends Scope {

    @Override
    public String getScopeName() {
        return "Global Scope::".concat(String.valueOf(super.getAddress()));
    }

}
