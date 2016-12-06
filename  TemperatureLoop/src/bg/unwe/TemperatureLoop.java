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
public class TemperatureLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double limit;
        String unit;
        System.out.println("Limit: ");
        limit = sc.nextDouble();
        if (limit < 1 || limit > 200) {
            System.out.println("Limit outside range");
            return;
        }
        System.out.println("Unit: ");
        unit = sc.next();
        if (!unit.equals("C") && !unit.equals("F")) {
            System.out.println("Unsupported unit");
            return;

        }
        for (double t = 0; t <= limit; t += 0.25) {
            if (unit.equals("C")) {
                double f = (9 / 5.0) * t + 32;
                System.out.printf("%.2f C=%.2f F\n", t, f);
            } else if (unit.equals("F")) {
                double c = (5.0 / 9) * (t - 32);
                System.out.printf("%.2f F=%.2f C\n", t, c);
            }
        }

    }

}
