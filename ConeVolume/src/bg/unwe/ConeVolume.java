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
public class ConeVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        if (r <= 0) {
            System.out.println("Radius must be > 0");
            return;

        }

        System.out.println("Enter the height: ");
        double h = sc.nextDouble();
        if (h <= 0) {
            System.out.println("Height must be > 0");
            return;
        }

        double V = (1 * (Math.PI * (r * r) * h) / 3);
        System.out.println("The volume of the cone is " + V);

    }
}
