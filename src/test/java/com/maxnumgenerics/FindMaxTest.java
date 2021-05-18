package com.maxnumgenerics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxTest {
    /**
     * here i have created an object of FindMaximum class.
     * created three test cases which will check and give the test case result.
     */
    FindMaximum findMax = new FindMaximum();
    @Test
    void ifNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(100,50,25));
    }

    @Test
    void ifNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(50, 100, 25));
    }

    @Test
    void ifNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(25, 50, 100));
    }

    /**
     * Similarly as above i have written test cases
     * created three test cases which will check and give the test case result.
     */

    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(10.0F, 5.0F, 2.5F));
    }

    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(5.0F, 10.0F, 2.5F));
    }

    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(2.5F, 5.0F, 10.0F));
    }
    /**
     * Similarly as above i have written test cases
     * created three test cases which will check and give the test case result.
     * Here i have taken String as values.
     */

    @Test
    void ifStringNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMax.findMaxString("banana", "peach", "apple"));
    }

    @Test
    void ifStringNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMax.findMaxString("apple", "banana", "peach"));
    }

    @Test
    void ifStringNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMax.findMaxString("peach", "apple", "banana"));
    }
}
