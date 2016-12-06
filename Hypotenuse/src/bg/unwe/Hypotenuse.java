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
public class Hypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        double c = Math.sqrt((a * a) + (b * b));

        System.out.println("The length of the hypotenuse is: " + c);
    }

}
