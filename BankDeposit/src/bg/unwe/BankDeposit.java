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
public class BankDeposit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        int amount = sc.nextInt();

         if (amount > 0 && amount<1000) {

            double month = (0.5 * amount)/100;
            System.out.println("1 month-0.5%-" + month);

            double year = (0.9 * amount)/100;
            System.out.println("1 year-0.9%-" + year);

            double years = (1.5 * amount)/100;
            System.out.println("2 years-1.5%-" + years);

        } else if (amount >=1000 && amount < 100000 ) {
            double month = (0.6 * amount)/100;
            System.out.println("1 month-0.6%-" + month);

            double year = (1.0 * amount)/100;
            System.out.println("1 year-1.0%-" + year);

            double years = (1.8 * amount)/100;
            System.out.println("2 years-1.8%-" + years);

        } else if (amount >= 100000 ) {
            double month = (0.8 * amount)/100;
            System.out.println("1 month-0.8%-" + month);

            double year = (1.2 * amount)/100;
            System.out.println("1 year-1.2%-" + year);

            double years = (2.2 * amount)/100;
            System.out.println("2 years-2.2%-" + years);

        } else if (amount <= 0){
            System.out.println("Amount must be greater than zero");
        }
    }

}
