package jambda.lang.main;

import jambda.lang.ast.ASTNativeListener;
import jambda.lang.compile.JambdaCompiler;
import jambda.lang.def.JambdaLexer;
import jambda.lang.def.JambdaParser;
import jambda.lang.handler.JambdaSyntaxErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Startup {

    final static String BEANS = "jambdaBeans.xml";

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext(BEANS);

        JambdaSyntaxErrorListener errorListenner = new JambdaSyntaxErrorListener();
        InputStream jambdaLanguage = Files.newInputStream(Paths.get(args[0]));
        JambdaLexer lexer = new JambdaLexer(new ANTLRInputStream(jambdaLanguage));
        JambdaParser parser = new JambdaParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errorListenner);

        ASTNativeListener ast = (ASTNativeListener) context.getBean("ast");
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(ast, parser.compilationUnit()); // walk parse tree, start parsing at the rule compilationUnit

        JambdaCompiler compiler = (JambdaCompiler) context.getBean("compiler");
//        System.out.println(compiler.showJavaSource());
        compiler.compile();
    }

}