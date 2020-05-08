package com.company;

public class Main {

    public static void main(String[] args) {

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

        double left = 45.9;
        double right = 78.0;
        MathEquation equationOverload = new MathEquation();
        equationOverload.execute(left,right);
        System.out.print("results= ");
        System.out.println(equationOverload.getResults());


        System.out.println();
        System.out.println("using inheritance");
        System.out.println();

        CalculateBase []  calculators = {
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
