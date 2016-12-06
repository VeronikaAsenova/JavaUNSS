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

        Scanner s = new Scanner(System.in);
        System.out.print("Size: ");
        int size = s.nextInt();
        int[] first = new int[size];
        int[] second = new int[size];
        
        for(int i = 0; i < first.length; i++) {
            System.out.print("first " + i + ": ");
            first[i] = s.nextInt();
        }
        for(int i = 0; i < second.length; i++){
            System.out.print("second " + i + ": ");
            second[i] = s.nextInt();
        }
        for(int i = 0; i < second.length; i++){
            System.out.println("" + first[i] * second[i]);
        }
    }
    
}
