package com.company;

public class MathEquation {
    private char opCodes;
    private double leftVal;
    private double rightVal;
    private double results;

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getResults() {
        return results;
    }



    public char getOpCodes() {
        return opCodes;
    }

    public void setOpCodes(char opCodes) {
        this.opCodes = opCodes;
    }

     public MathEquation(){}
    public MathEquation(char opCodes){
        this.opCodes = opCodes;
    }
    public MathEquation(char opCodes, double leftVal, double rightVal){
        this(opCodes);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }
    public void execute(){
        switch (opCodes){
            case 'a':
                results = leftVal + rightVal;
                break;
            case 'b':
                results = leftVal - rightVal;
                break;
            case 'c':
                results = rightVal != 0.0 ? leftVal / rightVal : 0.0;
                break;
            case 'd':
                results = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                results = 0.0;
                break;
        }

    }
}
