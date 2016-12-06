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
public class Century {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Year: ");
        int year = sc.nextInt();

        if (year < 1901) {
            System.out.println("Before 20th century");
        } else if (year > 2000) {
            System.out.println("After 20th century");
        } else {
            System.out.println("During 20th century");
        }
    }

}
