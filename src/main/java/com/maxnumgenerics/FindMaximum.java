package com.maxnumgenerics;

public class FindMaximum {
    /**
     * here i have created a parameterised constructor having given parameters.
     * First i have taken numberOne is maxNumber
     * then i used compareTo method which will compare with numberTwo..and gradually compare with numberThree also.
     * @param numberOne
     * @param numberTwo
     * @param numberThree
     * @return maxNumber
     */
    public int findMaxNumber(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Integer maxNumber = numberOne;
        if (numberTwo.compareTo(maxNumber) > 0) {
            maxNumber = numberTwo;
        }
        if (numberThree.compareTo(maxNumber) > 0) {
            maxNumber = numberThree;
        }
        return maxNumber;
    }

    /**
     * As above it'll work the same but having only float values.
     * @param numberOne
     * @param numberTwo
     * @param numberThree
     * @return
     */

    public float findFloatMaxNumber(Float numberOne, Float numberTwo, Float numberThree) {
        Float maxNumber = numberOne;
        if (numberTwo.compareTo(maxNumber) > 0) {
            maxNumber = numberTwo;
        }
        if (numberThree.compareTo(maxNumber) > 0) {
            maxNumber = numberThree;
        }
        return maxNumber;
    }
    /**
     * As above it'll work the same but having only String values.
     * @param numberOne
     * @param numberTwo
     * @param numberThree
     * @return
     */

    public String findMaxString(String numberOne, String numberTwo, String numberThree) {
        String maxString = numberOne;
        if (numberTwo.compareTo(maxString) > 0) {
            maxString = numberTwo;
        }
        if (numberThree.compareTo(maxString) > 0) {
            maxString = numberThree;
        }
        return maxString;
    }
}
