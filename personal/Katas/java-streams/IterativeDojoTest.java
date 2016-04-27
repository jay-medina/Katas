package com.yammer.dojo.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IterativeDojoTest {

    private List<String> li;
    private final static String expectedResult = "onetwothreefour";

    @Before
    public void setUp() {
        String [] nums = {"one", "two", "three", "four"};
        li = new ArrayList<>(Arrays.asList(nums));
    }

    @Test
    public void testIterativeConcatOfStrings() {
        String result = iterativeConcat(li);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testStreamIterateConcatOfStrings() {
        Writer writer = new StringWriter();
        PrintWriter pw = new PrintWriter(writer);

        /*
          Objective: Use a lambda expression with the print writer method!!
          Hint: pw has a write method!
         */

        String result = writer.toString();
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testStreamIterateConcatUsingMethodReference() {
        Writer writer = new StringWriter();
        PrintWriter pw = new PrintWriter(writer);

        /*
          Objective: use iterator with method reference!
         */

        String result = writer.toString();
        Assert.assertEquals(expectedResult, result);
    }

    String iterativeConcat(List<String> li) {
        String result = "";
        for(String s : li) {
            result += s;
        }

        return result;
    }
}
