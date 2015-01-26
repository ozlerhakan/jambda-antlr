package jambda.tests;

import jambda.lang.builder.Builder;
import jambda.lang.builder.JavaBuilder;
import jambda.lang.def.JambdaLexer;
import jambda.lang.def.JambdaParser;
import jambda.lang.handler.JambdaSyntaxErrorListener;
import jambda.lang.symbol.Scope;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by Hakan on 1/17/2015.
 */
public class JTest {

    public JambdaParser initialize(String resource) throws IOException {

        InputStream jambdaLanguage = getClass().getResourceAsStream(resource);
        JambdaSyntaxErrorListener errorListenner = new JambdaSyntaxErrorListener();
        JambdaLexer lexer = new JambdaLexer(new ANTLRInputStream(jambdaLanguage));
        JambdaParser parser = new JambdaParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errorListenner);

        return parser;
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testMyClass() throws IOException, NoSuchFieldException, IllegalAccessException {

        JambdaParser parser = initialize("/MyClass.jambda");

        StringBuilder sb = new StringBuilder();
        Builder builder = new JavaBuilder(sb);
        ASTNativeChild ast = new ASTNativeChild(builder);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(ast, parser.compilationUnit()); // walk parse tree, starting from the rule compilationUnit

        // Now get the currentScope field with the way of reflection api
        Field field = ast.getClass().getSuperclass().getDeclaredField("currentScope");
        field.setAccessible(true);
        Optional<Scope> globalScope = (Optional) field.get(ast);

        globalScope.ifPresent(scope -> {
            Assert.assertTrue("The Symbol Table must include 17 symbols in terms of the MyClass.jambda",
                    scope.getSymbolTable().size() == 17);
            Assert.assertTrue("There must be two doSomething methods in the MyClass class",
                    scope.getSymbolTable().values().stream().filter(v -> v.getPrefixName().equals("doSomething")).toArray().length == 2);
        });
    }

}
