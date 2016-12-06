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
public class Multiplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        size = sc.nextInt();
        int result;

        char[][] matrix = new char[size][size];
        for (int i = 0; i < matrix.length; i++) {

            

            System.out.println("first " + matrix[i] + ":");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("second " + j + ":");
            }
        }

    }

}
