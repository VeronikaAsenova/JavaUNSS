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
public class CurrencyConverterLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double amount, result;
        String currency;

        System.out.println("Amount: ");
        amount = s.nextDouble();

        if (amount <= 0 || amount > 1000) {
            System.out.println("Amount must be >0 and <=1000");
            return;
        }

        System.out.println("Currency: ");
        currency = s.next();

        if (!currency.equals("BGN") && !currency.equals("USD")) {
            System.out.println("Only BGN or USD");
            return;
        }

        if (currency.equals("USD")) {
            for (double i = 0; i <= amount; i += 0.5) {

                double usdToBgn = 1.72;
                result = i * usdToBgn;
                System.out.printf("%.2f USD = %.2f BGN\n",i,result);
            }
        }
        if (currency.equals("BGN")) {
            for (double i = 0; i <= amount; i += 0.5) {
                double usdToBgn = 1.72;
                result = i / usdToBgn;
                System.out.printf("%.2f BGN = %.2f USD\n",i,result);
            }
        }
    }
}
