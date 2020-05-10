package com.company.calcengine;

public class Adder extends CalculateBase implements MathProcessing{

    public  Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResults(value);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculations(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResults();
    }
}
