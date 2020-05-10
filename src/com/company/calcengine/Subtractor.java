package com.company.calcengine;

import com.company.calcengine.CalculateBase;

public class Subtractor extends CalculateBase implements MathProcessing{

    public Subtractor(){}
    public Subtractor(double leftVal ,double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResults(value);
    }

    @Override
    public String getKeyword() {
        return "subtract";
    }

    @Override
    public char getSymbol() {
        return '-';
    }

    @Override
    public double doCalculations(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResults();
    }
}
