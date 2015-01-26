package jambda.lang.aspects;

import jambda.lang.exception.NoSuchNameException;
/**
 *
 * Created by Hakan on 1/20/2015.
 */
public aspect ExceptionHandlerAspect {

    before(NoSuchNameException e) : handler(NoSuchNameException) && args(e) && within(jambda.lang.builder..*){
        System.err.println(e.getMessage());
        System.exit(1);
    }

}