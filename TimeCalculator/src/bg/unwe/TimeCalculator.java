/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author Veronika
 */
public class TimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double seconds = 1540800;
        double minutes = (seconds / 60);
        double hours = (minutes / 60);
        double days = (hours / 24);
        double weeks = (days / 7);
        double years = (days / 365);

        System.out.println(" Minutes: " + minutes + " Hours: " + hours
                + " Days: " + days + " Weeks: " + weeks + " Years: " + years);

    }

}
