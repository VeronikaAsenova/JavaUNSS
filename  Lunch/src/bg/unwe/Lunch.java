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
public class Lunch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the bill? ");
        double bill = sc.nextDouble();
        double paid = 0;
        System.out.println("How many of you are there? ");
        int people = sc.nextInt();

        for (int person = 1; person <= people; person++) {

            System.out.println(" Person " + person + " gives: ");
            double sum = sc.nextDouble();

            paid += sum;
           
            
        }
      System.out.printf("Paid: %.2f\n",paid);
        
        if (paid < bill) {
            double result = (bill - paid);
             result=Math.round(result*100)/100.00;
             System.out.printf("%.2f leva left to pay the bill\n",result);
        }
        if (paid>=bill) {
            double result=(paid-bill);
            result=Math.round(result*100)/100.00;
                 System.out.printf("Tip: %.2f\n",result);
        }

    }

}
