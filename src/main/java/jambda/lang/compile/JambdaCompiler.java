package jambda.lang.compile;

import jambda.lang.builder.Builder;
import sun.misc.Unsafe;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.util.Collections.singletonList;

/**
 * This class is representing to compile the Java source code converted from the demo.jambda file
 * In other words, we create a java class on the fly at runtime, from source code created from the our jambda file using 'JavaBuilder'
 *
 * Created by Hakan on 1/16/2015.
 */
public class JambdaCompiler {

    private Builder code;

    public JambdaCompiler(Builder source) {
        this.code = source;
    }

    public void compile() throws Exception {
        // this will generate a virtual java file called "MyClass.java" including the source code
        JavaSourceFromString source = new JavaSourceFromString("MyClass", code.getBuilder());

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        JavaFileManager javaFileManager = new DispatchJavaFileManager(fileManager, source);
        JavaCompiler.CompilationTask task = compiler.getTask(null, javaFileManager, null, null, null, singletonList(source));

        // if you get the following 2 warnings :
        // warning: Supported source version 'RELEASE_6' from annotation processor 'org.antlr.v4.runtime.misc.NullUsageProcessor' less than -source '1.8'
        // warning: Supported source version 'RELEASE_6' from annotation processor 'org.sonatype.guice.bean.scanners.index.SisuIndexAPT6' less than -source '1.8'
        // read the related issue about ANTLR on github this is why the warnings come up : https://github.com/antlr/antlr4/issues/487
        if (task.call()) {
            // if you arrive here, it means that the Java source translated from our jambda file successfully compiled (with no errors)!

            // A byte array output stream containing the bytes
            byte[] bytes = ((ByteArrayOutputStream) source.openOutputStream()).toByteArray();

            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            Unsafe unsafe = (Unsafe) f.get(null);
            Class myClass = unsafe.defineClass("jambda/lang/test/MyClass", bytes, 0, bytes.length, null, null);

            Object myClassInstance = myClass.newInstance();
            Method main = myClassInstance.getClass().getMethod("main", String[].class);

            Object[] args = new Object[1];
            main.invoke(null, args);

            // After invoking the main method of the Jambda (i.e. execution((string... args) -> the Java equivalent is "public static void main(String... args)")
            // Here is the result :
            // 1:Ali
            // 2:Veli
            // true
            // Ali:Kodcu.com
            // Veli:Kodcu.com

        } else {
            for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
                System.out.format("Error on line %d in %s%n", diagnostic.getLineNumber(), diagnostic.getSource().toUri());
            }
        }
        fileManager.close();
    }

    public String showJavaSource(){
        return this.code.getBuilder().toString();
    }
}
