/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt2;

/**
 *
 * @author Veronika
 */
public class Testt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0, j = 5;
        for (;;) 
        {
            i++;
            for (;;)
            {
                if (i > --j)
                {
                    continue;
                }
            }System.out.println("i="+i+""+j);
        }
    }

}
