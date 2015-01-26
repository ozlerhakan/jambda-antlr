package jambda.lang.symbol;

/**
 * Created by Hakan on 1/12/2015.
 */
public class LocalScope extends Scope {

    public LocalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public String getScopeName() {
        return "Local Scope::".concat(String.valueOf(super.getAddress()));
    }

}
