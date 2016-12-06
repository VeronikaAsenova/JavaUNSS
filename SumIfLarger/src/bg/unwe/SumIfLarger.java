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
public class SumIfLarger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int before ;

       do{sum+=number;
       before=number;
          
                       System.out.print("Next: ");
             number=sc.nextInt();
 
        } while (before <=number);
       
        System.out.println("Result is :" + sum);
    }
}
