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
public class WashingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a programme: ");
        int programme = sc.nextInt();

        switch (programme) {

            case 1:
                System.out.println("60 degrees, Time: 125 minutes");
                break;

            case 2:
                System.out.println("90 degrees, Time: 106 minutes");
                break;

            case 3:
                System.out.println("40 degrees, Time: 98 minutes");
                break;

            case 4:
                System.out.println("50 degrees, Time: 65 minutes");
                break;

            case 5:
                System.out.println("Desired temperature: ");
                double temperature = sc.nextDouble();
                System.out.println("Desired time: ");
                int time = sc.nextInt();
                System.out.println("Temperature: " + temperature + "Time" + time);
                break;

            default:
                System.out.println("No such programme");
                break;

        }

    }

}
