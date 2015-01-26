package jambda.lang.exception;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by Hakan on 1/16/2015.
 */
public class NoSuchNameException extends RuntimeException {

    public NoSuchNameException(TerminalNode ctx) {
        super(String.join(" ","NoSuchNameException:", ctx.getText(), "is a nonexistent name on line",String.valueOf(ctx.getSymbol().getLine())));
    }

}
