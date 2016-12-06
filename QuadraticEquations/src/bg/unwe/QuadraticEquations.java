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
public class QuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a = 3;
        double b = 12.5;
        double c = 9;

        double D = Math.sqrt((b * b - 4 * a * c));
        System.out.println("Your discriminant is : " + D);
        
        double x1=(-b-D)/(2*a);
        double x2=(-b+D)/(2*a);
        
        System.out.println("x1: " +x1);
        System.out.println("x2: "+ x2);
        
       
    }

}
