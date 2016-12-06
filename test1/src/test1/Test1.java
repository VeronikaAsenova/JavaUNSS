/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Veronika
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int i=1,j=0;
     switch(i)
     {
         case 2: j+=6;
         case 4:j+=1;
         default:j+=2;
         case 0:j+=4;}
     
        System.out.println(""+j);
    }
    
}
