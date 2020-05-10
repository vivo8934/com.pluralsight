package com.company.calcengine;

public class PowerOf implements MathProcessing {
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculations(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
