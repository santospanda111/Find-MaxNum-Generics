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
}
