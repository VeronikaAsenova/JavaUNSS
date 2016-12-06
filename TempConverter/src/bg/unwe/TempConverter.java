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
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double Fahrenheit = 98;
        double Celsius = 5 * ((Fahrenheit - 32) / 9);

        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
        System.out.println("Temperature in Celsius is: " + Celsius);
    }

}
