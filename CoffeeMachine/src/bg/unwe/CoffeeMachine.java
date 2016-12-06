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
public class CoffeeMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount;
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        amount = sc.nextDouble();

        String menu = "1. short espresso\t0.50\n2."
                + "long espresso\t0.60\n3. "
                + "cappuccino\t0.85\n4."
                + "coffee with milk\t0.90\n5."
                + "caffeinefree\t0.60\n";
        System.out.println(menu);

        System.out.println("Your choice");
        choice = sc.nextInt();

        double price =choice;
       

        switch (choice) {

            case 1:
                price=0.50;
                break;
            case 2:
                price=0.60;
                break;
            case 3:
                price=0.85;
                break;
            case 4:
               price=0.90;
                break;
            case 5:
               price=0.60;
                break;
            default:
                System.out.println("Please select from the menu");
                break;

        }
        
        
        if (price>amount) {
            System.out.println("Not enough money");
        }
        if (amount==price) {
            System.out.println("Preparing your drink");
        }
        if(price<amount) {
            System.out.println("Preparing your drink");
            System.out.println("Change: " + (amount-price));
        }
            
        }

    }


