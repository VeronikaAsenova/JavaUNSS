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
public class HypotenuseLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int maxA, MaxB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Max A: ");
        maxA = sc.nextInt();
        System.out.println("Max B: ");
        MaxB = sc.nextInt();
        for (int a = 1; a <=maxA; a++) {
            for (int b = 1; b <= MaxB; b++) {
                System.out.printf("For a=%d and b=%d, ", a, b);
                double c = Math.sqrt(a * a + b * b);
                System.out.printf("Hypotenuse: %.2f\n", c);

            }
        }

    }

}
