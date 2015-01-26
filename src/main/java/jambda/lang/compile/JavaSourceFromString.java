package jambda.lang.compile;

import javax.tools.SimpleJavaFileObject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

/**
 * A file object used to represent source coming from a string.
 *
 * Created by Hakan on 1/18/2015.
 */
public class JavaSourceFromString extends SimpleJavaFileObject {

    // A byte array output stream containing the bytes that would be written to the .class file
    final ByteArrayOutputStream output = new ByteArrayOutputStream();

    // The source code of this "file"
    final StringBuilder code;

    /**
     * Constructs a new JavaSourceFromString.
     *  @param name the name of the compilation unit represented by this file object
     *  @param code the source code for the compilation unit represented by this file object
     */
    JavaSourceFromString(String name, StringBuilder code) {
        super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
        this.code = code;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        return code;
    }

    // we have to override the method in javax.tool.SimpleJavaFileObject
    @Override
    public OutputStream openOutputStream() throws IOException {
        return output;
    }
}