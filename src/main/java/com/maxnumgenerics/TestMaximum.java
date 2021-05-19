package com.maxnumgenerics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.awt.*;

/**
 * here i have refactored the class as well as methods.
 * Here it's a Generic class having type E.
 * Took 3 values.
 * @param <E>
 */

public class TestMaximum<E extends Comparable<E>> {
    E firstValue, secondValue, thirdValue;

    /**
     * Here this one is a parameterised constructor having these parameters to initiate the values.
     * @param firstValue
     * @param secondValue
     * @param thirdValue
     */
    TestMaximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    /**
     * This one is a default constructor.
     */
    public TestMaximum() {
    }

    /**
     * Here i have created a method of return type E.
     * @return
     */
    public E testMaximum() {
        return testMaximum(firstValue, secondValue, thirdValue);
    }

    /**
     * In this method ..it'll check the values and give the maximum as an output.
     * @param firstValue
     * @param secondValue
     * @param thirdValue
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> E testMaximum(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }

    /**
     * here i have created an array which will take more than one parameter.
     * It'll sort the list.
     * @param args
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> E testMaximumMore(E... args) {
        List<E> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    /**
     * here i have used the main method which will execute the methods as well as print the max values.
     * @param args
     */
    public static void main(String args[]) {
        TestMaximum testMaximumObj = new TestMaximum();
        System.out.println("Max: "+testMaximumObj.testMaximumMore(1, 10, 13, 17, 25, 43, 21, 56, 60));
        System.out.println("Max: "+testMaximumObj.testMaximumMore(1.0F, 10.0F, 13.0F, 1.70F, 2.05F, 4.3F, 21.0F, 56.0F, 60.0F));
        System.out.println("Max: "+testMaximumObj.testMaximumMore("apple", "peach", "banana", "mango", "kiwi"));
    }
}
