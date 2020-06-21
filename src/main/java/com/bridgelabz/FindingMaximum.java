package com.bridgelabz;

public class FindingMaximum {
    public Integer analyzeMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximum = firstNumber;
        if (maximum.compareTo(secondNumber) < 0) {
            maximum = secondNumber;
        }
        if (maximum.compareTo(thirdNumber) < 0) {
            maximum = thirdNumber;
        }
        return maximum;
    }

    public Double analyzeFloatMax(double firstNumber, double secondNumber, double thirdNumber) {
        Double maximum = firstNumber;
        if (maximum.compareTo(secondNumber) < 0) {
            maximum = secondNumber;
        }
        if (maximum.compareTo(thirdNumber) < 0) {
            maximum = thirdNumber;
        }
        return maximum;
    }
}
