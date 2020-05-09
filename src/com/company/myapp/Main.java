package com.company.myapp;

import com.company.calcengine.Adder;
import com.company.calcengine.CalculateBase;
import com.company.calcengine.CalculatorHelper;
import com.company.calcengine.Divider;
import com.company.calcengine.InvalidStatementException;
import com.company.calcengine.MathEquation;
import com.company.calcengine.Multiplyer;
import com.company.calcengine.Subtractor;

public class Main {

    public static void main(String[] args) {

        //useCalculateBase();
        //useMathEquation();
        String [] statements = new String[]{
                "add 1.0",
                "add xx 12.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "Multiphy 10.0 5.0"
        };
        CalculatorHelper helper = new CalculatorHelper();
        for (String statement:statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            }catch (InvalidStatementException e){
                System.out.println("Error: " + e.getMessage());
                if (e.getCause() != null)
                    System.out.println("Original error: " + e.getCause().getMessage());
            }
        }

        }
        static  void useMathEquation(){
            MathEquation[] equations = new MathEquation[4];
            equations[0] = new MathEquation('a',20.9,70.0);
            equations[1] = new MathEquation('b', 92.0, 25.0);
            equations[2] = new MathEquation('c', 17.0, 225.0);
            equations[3] = new MathEquation('d', 3.0, 11.0);

            for (MathEquation equation: equations) {
                equation.execute();
                System.out.print("results = ");
                System.out.println(equation.getResults());

            }

        }
        static void useCalculateBase(){
            double left = 45.9;
            double right = 78.0;
            MathEquation equationOverload = new MathEquation();
            equationOverload.execute(left,right);
            System.out.print("results= ");
            System.out.println(equationOverload.getResults());

            System.out.println();
            System.out.println("using inheritance");
            System.out.println();

            CalculateBase[]  calculators = {
                    new Divider(100.0, 20.0),
                    new Subtractor(45.9, 30.1),
                    new Multiplyer(10.3, 3.5),
                    new Adder(40.5, 55.5)
            };
            for (CalculateBase calculator: calculators){
                calculator.calculate();
                System.out.print("results= ");
                System.out.println(calculator.getResults());
            }
        }

}
