package jambda.lang.handler;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by Hakan on 1/16/2015.
 */
public class JambdaSyntaxErrorListener extends BaseErrorListener {

    /**
     * As long as a syntax error appears in the ast grammar, this method is being invoked!
     *
     * Note: You can collect all the syntax errors appearing in the grammar, now the system
     * just terminates when reaching the first syntax error.
     *
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg,
                            org.antlr.v4.runtime.RecognitionException e) {
        System.err.println(msg + " on line " + line);
        System.exit(1);
    }

}
