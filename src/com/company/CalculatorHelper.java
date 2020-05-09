package com.company;

import static com.company.MathCommand.*;

public class CalculatorHelper {
    MathCommand command;
    double leftVal;
    double rightVal;
    double results;

    public void process(String statement) throws InvalidStatementException{
        String [] parts = statement.split(" ");
        if (parts.length != 3)
            throw new InvalidStatementException("Incorrect number of fields", statement);

        String commandString = parts[0]; // add

        try {
            leftVal = Double.parseDouble(parts[1]);
            rightVal = Double.parseDouble(parts[2]);
        }catch (NumberFormatException e){
            throw new InvalidStatementException("Non-numberic data", statement, e);
        }

        setCommandFromString(commandString);
        if (command == null)
            throw new InvalidStatementException("Invalid command", statement);

        CalculateBase calculateBase = null;
        
//        if (command.equals(Add))
//            calculateBase = new Adder(leftVal,rightVal);
//        else if (command.equals(Subtract))
//            calculateBase = new Subtractor(leftVal,rightVal);
//        else if (command.equals(Divide))
//            calculateBase = new Divider(leftVal,rightVal);
//        else if (command.equals(Multiply))
//            calculateBase = new Multiplyer(leftVal,rightVal);
        switch (command){
            case Add:
                calculateBase = new Adder(leftVal,rightVal);
                break;
            case Subtract:
                calculateBase = new Subtractor(leftVal,rightVal);
                break;
            case Divide:
                calculateBase = new Divider(leftVal,rightVal);
                break;
            case Multiply:
                calculateBase = new Multiplyer(leftVal, rightVal);
                break;

        }
        calculateBase.calculate();
        results = calculateBase.getResults();
    }

    private CalculateBase getCalculateBase() {
        return null;
    }

    private void setCommandFromString(String commandString){
        if (commandString.equalsIgnoreCase(Add.toString()))
            command = Add;
        else if (commandString.equalsIgnoreCase(Subtract.toString()))
            command = Subtract;
        else if (commandString.equalsIgnoreCase(Divide.toString()))
            command = Divide;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;

    }
    @Override
    public String toString(){
        char symbol = ' ';
        switch (command){
            case Multiply:
                symbol = '*';
                break;
            case Divide:
                symbol = '/';
                break;
            case Subtract:
                symbol = '-';
                break;
            case Add:
                symbol = '+';
        }
        StringBuilder sb  = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(results);

        return  sb.toString();
    }
}
