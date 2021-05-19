package com.maxnumgenerics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * here in this test class i have created an object of main class and call all the methods of test cases.
 */
public class FindMaxTest {
    TestMaximum testMaxObj = new TestMaximum();

    /**
     * Here i have created almost 12 test cases which will check the max and according to the test cases it'll get passed.
     */
    @Test
    void ifIntegerNumberOneIsMaxReturnTrue() {
        TestMaximum<Integer> testMaximumInteger = new TestMaximum<>(100, 50, 25);
        Assertions.assertEquals(100, testMaximumInteger.testMaximum());
    }

    @Test
    void ifIntegerNumberTwoIsMaxReturnTrue() {
        TestMaximum<Integer> testMaximumInteger = new TestMaximum<>(50, 100, 25);
        Assertions.assertEquals(100, testMaximumInteger.testMaximum());
    }

    @Test
    void ifIntegerNumberThreeIsMaxReturnTrue() {
        TestMaximum<Integer> testMaximumInteger = new TestMaximum<>(25, 50, 100);
        Assertions.assertEquals(100, testMaximumInteger.testMaximum());
    }

    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        TestMaximum<Float> testMaximumInteger = new TestMaximum<>(10.0F, 5.0F, 2.5F);
        Assertions.assertEquals(10.0F, testMaximumInteger.testMaximum());
    }
    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        TestMaximum<Float> testMaximumInteger = new TestMaximum<>(5.0F, 10.0F, 2.5F);
        Assertions.assertEquals(10.0F, testMaximumInteger.testMaximum());
    }
    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        TestMaximum<Float> testMaximumInteger = new TestMaximum<>(2.5F, 5.0F, 10.0F);
        Assertions.assertEquals(10.0F, testMaximumInteger.testMaximum());
    }
    @Test
    void ifStringOneIsMaxReturnTrue() {
        TestMaximum<String> testMaximumInteger = new TestMaximum<>("banana", "peach", "apple");
        Assertions.assertEquals("peach", testMaximumInteger.testMaximum());
    }

    @Test
    void ifStringTwoIsMaxReturnTrue() {
        TestMaximum<String> testMaximumInteger = new TestMaximum<>("apple", "banana", "peach");
        Assertions.assertEquals("peach", testMaximumInteger.testMaximum());
    }
    @Test
    void ifStringThreeIsMaxReturnTrue() {
        TestMaximum<String> testMaximumInteger = new TestMaximum<>("peach", "apple", "banana");
        Assertions.assertEquals("peach", testMaximumInteger.testMaximum());
    }

    @Test
    void giveMaxInteger() {
        Assertions.assertEquals(60, testMaxObj.testMaximumMore(1, 10, 13, 17, 25, 43, 21, 56, 60));
    }

    @Test
    void giveMaxFloat() {
        Assertions.assertEquals(60.0F, testMaxObj.testMaximumMore(1.0F, 10.0F, 13.0F, 1.70F, 2.05F, 4.3F, 21.0F, 56.0F, 60.0F));
    }

    @Test
    void  giveMaxString() {
        Assertions.assertEquals("peach", testMaxObj.testMaximumMore("apple", "peach", "banana", "mango", "kiwi"));
    }
}