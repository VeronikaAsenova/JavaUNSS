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
public class QuadraticEquationsLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Limit: ");
        int N = sc.nextInt();
        double x1, x2;
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                for (int c = 1; c <= N; c++) {
                    System.out.println(" a= " + a + " b= " + b + " c= " + c);
                    double d = b * b - 4 * a * c;
                    if (d > 0) {
                        x1 = ((-b) - Math.sqrt(d)) / (2 * a);
                        x2 = ((-b) + Math.sqrt(d)) / (2 * a);

                        System.out.println("x1= " + x1);
                        System.out.println("x2= " + x2);
                    }
                    if (d < 0) {
                        System.out.println("No solution");
                    }
                    if (d == 0) {
                        x1 =(-b)  / (2 * a);
                        System.out.println("x1= " + x1);

                    }
                }
            }

        }
    }
}
