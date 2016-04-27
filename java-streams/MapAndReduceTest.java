package com.yammer.dojo.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MapAndReduceTest {

    private List<String> li;

    @Before
    public void setUp() {
        String [] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        li = new ArrayList<>(Arrays.asList(nums));
    }

    @Test
    public void testMapToAListOfIntegers() {
        List<Integer> listOfInts = null;
        /*
          Objective: Convert the list of strings to a list of integers
         */
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10), listOfInts);
    }

    @Test
    public void testSumListOfIntegers() {
        Integer sum = null;

        /*
         Objective: Convert list to ints and sum all numbers
         */

        Assert.assertEquals(new Integer((10*11)/2), sum);

    }

}
