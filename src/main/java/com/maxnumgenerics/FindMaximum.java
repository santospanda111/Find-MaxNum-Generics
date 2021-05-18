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

}
