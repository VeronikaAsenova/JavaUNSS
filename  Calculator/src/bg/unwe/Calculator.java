/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Veronika
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double firstNumber, secondNumber;

        System.out.println("First number: ");
        firstNumber = sc.nextDouble();

        System.out.println("Second number: ");
        secondNumber = sc.nextDouble();

        System.out.println("Operator: ");
        String operator = sc.next();

        if (operator.equals("+")) {
            double result = firstNumber + secondNumber;
            System.out.println("Result: " + result);
        }
        if (operator.equals("-")) {
            double result = firstNumber - secondNumber;
            System.out.println("Result: " + result);

        }
        if (operator.equals("*")) {
            double result = firstNumber * secondNumber;
            System.out.println("Result: " + result);
        }
        if (operator.equals("/") && firstNumber == 0 || secondNumber == 0) {
            System.out.println("Division by zero is not allowed");

            double result = firstNumber / secondNumber;
            System.out.println("Result: " + result);

        }
        if (operator.equals("%") && firstNumber == 0 || secondNumber == 0) {
            System.out.println("Division by zero is not allowed");
            double result = firstNumber % secondNumber;
            System.out.println("Result: " + result);
        }else if  (operator != "+,-,*,/,%") {
            System.out.println("This operator is not supported");
        }
    }

}
