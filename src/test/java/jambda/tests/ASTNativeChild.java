package jambda.tests;

import jambda.lang.ast.ASTNativeListener;
import jambda.lang.builder.Builder;
import jambda.lang.def.JambdaParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by Hakan on 1/18/2015.
 */
public class ASTNativeChild extends ASTNativeListener {

    public ASTNativeChild(Builder builder) {
        super(builder);
    }

    @Override
    public void exitClassBody(@NotNull JambdaParser.ClassBodyContext ctx) {
        NESTED_DEPTH--;
        builder.exitClassBody();
        // no need to pop currentScope as null for the test class
    }
}
