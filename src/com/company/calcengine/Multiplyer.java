package com.company.calcengine;

import com.company.calcengine.CalculateBase;

public class Multiplyer extends CalculateBase {

    public Multiplyer(){}
    public Multiplyer(double leftVal,double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResults(value);
    }
}
