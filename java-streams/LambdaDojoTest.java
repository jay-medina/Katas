package com.yammer.dojo.demo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.function.Function;

public class LambdaDojoTest {

    /*
      NOTE: IGNORE THE INTELLIJ RECOMMENDATION!
            THAT IS THE PURPOSE OF THIS EXERCISE!!!

      Please leave the assertions alone
     */

    @Test
    public void anonymousClass() {

        Function<String, Integer> func = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        assertEquals(func.apply("42"), new Integer(42));
    }

    @Test
    public void convertToLambda() {
        /*
          Objective: Convert the anonymous class into a lambda expression

         */
        Function<String, Integer> func = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

         assertEquals(func.apply("42"), new Integer(42));
    }

    @Test
    public void convertToMethodReference() {
        /*
            Objective: Instead of using a lambda expression wrapper, use a method reference instead.

         */

        Function<String, Integer> func = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        assertEquals(func.apply("42"), new Integer(42));
    }
}
