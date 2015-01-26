package jambda.lang.exception;

/**
 * Created by Hakan on 1/14/2015.
 */
public class DuplicateMethodException extends RuntimeException {
    public DuplicateMethodException(String message) {
        super(message);
    }
}
