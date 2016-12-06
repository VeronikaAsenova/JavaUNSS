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
public class CoffeMachineLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount, price, change;
        int choice;
        String menu = "1. short espresso\t0.50\n2. long espresso\t0.60\n3. cappuccino\t0.85\n4. coffee with milk\t0.90\n5. caffeine- free\t0.60\n";
        Scanner s = new Scanner(System.in);

        for (;;) {
            price = 0;
            System.out.print("Amount: ");
            amount = s.nextDouble();
            System.out.print(menu);
            System.out.print("Your choice: ");
            choice = s.nextInt();

            boolean exit = false;
            boolean skip = false;

            switch (choice) {
                case 1:
                    price = 0.50;
                    break;
                case 2:
                    price = 0.60;
                    break;
                case 3:
                    price = 0.85;
                    break;
                case 4:
                    price = 0.90;
                    break;
                case 5:
                    price = 0.60;
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Please select from the menu");
                    skip = true;
                    break;
            }

            if (exit) {
                break;
            } else if (skip) {
                continue;
            }

            if (price > amount) {
                System.out.println("Not enough money");
            } else if (price < amount) {
                System.out.println("Preparing your drink...");
                System.out.println("Change: " + (amount - price));
            } else {
                System.out.println("Preparing your drink...");
            }
        }
    }
}
