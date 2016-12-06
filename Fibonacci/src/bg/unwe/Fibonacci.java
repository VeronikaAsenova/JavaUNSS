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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Limit :");
        int N = sc.nextInt();
        
        int first = 0;
        int second = 1;
        int sum;

       
        for (int i = 0; i < N-2; i++) {
            sum = first + second;
            System.out.println( sum  );
            first = second;
            second = sum;
        }
    }

}
