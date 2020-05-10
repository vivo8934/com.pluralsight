package com.company.calcengine;

import com.company.calcengine.CalculateBase;

public class Divider extends CalculateBase implements MathProcessing{

    public Divider(){}
    public Divider(double leftVal,double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
      double value = getLeftVal() / getRightVal();
      setResults(value);
    }

    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculations(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResults();
    }
}
