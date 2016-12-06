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
public class GeometricProgression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Min: ");
        min = sc.nextInt();
        System.out.println("Max: ");
        max = sc.nextInt();
        for (int i = min; i <= max; i *= 2) {
            System.out.println(i);
        }

    }

}
