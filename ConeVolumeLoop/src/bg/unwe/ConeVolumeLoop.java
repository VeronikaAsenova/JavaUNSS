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
public class ConeVolumeLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxRadius, maxHeight;

        System.out.println("Max Radius: ");
        maxRadius = sc.nextInt();
        System.out.println("Max Height: ");
        maxHeight = sc.nextInt();

        for (int r = 1; r <= maxRadius; r++) {
            for (int h = 1; h <= maxHeight; h++) {
                System.out.printf(" radius %d , height %d, ", r, h);
                double V = (1 * (Math.PI * (r * r) * h) / 3);
                
            }
        }

    }

}
