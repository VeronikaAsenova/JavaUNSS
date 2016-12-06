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
public class WorldMap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double latitude1, longitude1, latitude2, longitude2;
        Scanner s = new Scanner(System.in);
        System.out.print("Latitude 1: ");
        latitude1 = s.nextDouble();
        System.out.print("Longitude 1: ");
        longitude1 = s.nextDouble();

        while (true) {
            System.out.print("Latitude 2: ");
            latitude2 = s.nextDouble();
            System.out.print("Longitude 2: ");
            longitude2 = s.nextDouble();
            System.out.println("GPS 1: " + latitude1 + " " + longitude1);
            System.out.println("GPS 2: " + latitude2 + " " + longitude2);
            if (latitude1 == latitude2 && longitude1 == longitude2) {
                System.out.println("This is the same place");
                break;
            } else {
                String latitude = "";
                String longitude = "";
                if (latitude1 > latitude2) {
                    latitude = "SOUTH";
                } else if (latitude1 < latitude2) {
                    latitude = "NORTH";
                }

                if (longitude1 > longitude2) {
                    longitude = "WEST";
                } else if (longitude1 < longitude2) {
                    longitude = "EAST";
                }

                System.out.println(latitude + longitude);
            }
        }
    }
}
