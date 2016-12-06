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
public class Excel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("How many numbers? ");
        size = sc.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + i + ":");
            numbers[i] = sc.nextInt();

        }
        System.out.println("Function?");
        String funct = sc.next();

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0, count = 0;
        double average = 0;

        for (int number : numbers) {
            sum += number;
            count++;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        average = (double) sum / count;
        if (funct.equals("SUM")) {
            System.out.printf("Result: %d", sum);

        }
        if (funct.equals("AVERAGE")) {
            System.out.printf("Result: %.2f,", average);
        }
        if (funct.equals("MIN")) {
            System.out.printf(" Result: %d\n", min);
        }
        if (funct.equals("MAX")) {
            System.out.printf(" Result: %d\n", max);
        }
        else{
            System.out.println("Unsupported function");
        }

    }

}
