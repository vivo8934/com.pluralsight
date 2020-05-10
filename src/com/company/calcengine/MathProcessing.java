package com.company.calcengine;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword();
    char getSymbol();
    double doCalculations(double leftVal,double rightVal);
}
