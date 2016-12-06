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
public class AirConditioner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double externalTemp, internalTemp, desiredTemp;

        System.out.println("External temp: ");
        externalTemp = sc.nextDouble();

        System.out.println("Internal temp: ");
        internalTemp = sc.nextDouble();

        System.out.println("Desired temp: ");
        desiredTemp = sc.nextDouble();

        if (desiredTemp < internalTemp && externalTemp > internalTemp) {
            System.out.println("MAX COLD MODE");
        }
        else if ((desiredTemp<internalTemp && externalTemp<=internalTemp)) {
            System.out.println("ENERGY SAVING COLD MODE");
        }
        else if (desiredTemp>internalTemp && externalTemp<internalTemp) {
            System.out.println("MAX WARM MODE");
        }
        else if (desiredTemp>internalTemp && externalTemp>=internalTemp) {
            System.out.println("ENERGY SAVING WARM MODE");
        }
        else if (desiredTemp==internalTemp) {
            System.out.println("PAUSED");
        }
    }

}
