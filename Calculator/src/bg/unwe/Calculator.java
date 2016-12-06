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
        double a, b, result;
        String operator;
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        a = input.nextDouble();
        System.out.print("Second number: ");
        b = input.nextDouble();
        System.out.print("Operator: ");
        operator = input.next();
        if (a == 0 || b == 0) {
            System.out.println("Operation by zero is not allowed");
        } else {
            switch (operator) {
                case "+":
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    result = a / b;
                    System.out.println("Result: " + result);
                    break;
                case "%":
                    result = a % b;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("This operator is not supported");
            }
        }
    }

}
