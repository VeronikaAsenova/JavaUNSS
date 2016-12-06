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
public class WorldMap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Latitude1:");
        double lat1 = s.nextDouble();
        System.out.print("Longitude1:");
        double long1 = s.nextDouble();
        System.out.print("Latitude2:");
        double lat2 = s.nextDouble();
        System.out.print("Longitude2:");
        double long2 = s.nextDouble();

        System.out.println("GPS 1: " + lat1 + " " + long1);
        System.out.println("GPS 2: " + lat2 + " " + long2);

        if (lat1 > lat2 && long1 == long2) {
            System.out.println("South");
        }
        if (lat1 < lat2 && long1 == long2) {
            System.out.println("North");
        }
        if (lat1 == lat2 && long1 > long2) {
            System.out.println("West");
        }
        if (lat1 == lat2 && long1 < long2) {
            System.out.println("East");
        }

        if (lat1 > lat2 && long1 > long2) {
            System.out.println("SOUTHWEST");
        }
        if (lat1 < lat2 && long1 > long2) {
            System.out.println("NORTHWEST");
        }
        if (lat1 > lat2 && long1 < long2) {
            System.out.println("SOUTHEAST");
        }
        if (lat1 < lat2 && long1 < long2) {
            System.out.println("NORTHEAST");
        } else if (lat1 == lat2 && long1 == long2) {
            System.out.println("This is the same"
                    + "place");
        }
    }

}
