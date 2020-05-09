package com.company.calcengine;

import com.company.calcengine.CalculateBase;

public class Subtractor extends CalculateBase {

    public Subtractor(){}
    public Subtractor(double leftVal ,double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResults(value);
    }
}
