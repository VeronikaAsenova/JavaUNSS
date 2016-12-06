/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Veronika
 */
public class MatrixHorizontal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int rows, cols;

        Scanner s = new Scanner(System.in);
        System.out.print("How many rows? ");
        rows = s.nextInt();
        System.out.print("How many columns? ");
        cols = s.nextInt();

        int count = 1;

        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = count++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d\t", m[i][j]);
            }
            System.out.println();
        }

    }
}
