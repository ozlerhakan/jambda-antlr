package jambda.lang.compile;

import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import java.io.IOException;

/**
 * As ForwardingJavaFileManager class says:
 * Forwards calls to a given file manager. Subclasses (e.g. DispatchJavaFileManager) of this class might override some of these methods and might also provide additional fields and methods.
 *
 * Created by Hakan on 1/18/2015.
 */
public class DispatchJavaFileManager extends ForwardingJavaFileManager {

    JavaFileObject source;

    DispatchJavaFileManager(JavaFileManager fileManager, JavaFileObject source) {
        super(fileManager);
        this.source = source;
    }

    @Override
    public JavaFileObject getJavaFileForOutput(Location location, String className,
                                               JavaFileObject.Kind kind, FileObject sibling) throws IOException {
        return source;
    }
}
