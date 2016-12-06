/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Veronika
 */
public class MatrixHorizontal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                int rows, cols;
	        System.out.println("How many rows? ");
	        rows = sc.nextInt();
	        System.out.println("How many columns? ");
	        cols = sc.nextInt();

	        int[][] matrix = new int[rows][cols];

	        for (int row = 0; row < matrix.length; row++) {
	            for (int col = 0; col < matrix[row].length; col++) {
	            	if(rows==cols){
	                matrix[row][col] =  1 +  row * matrix.length + col;
	                System.out.printf("%d\t", matrix[row][col]);
	            	}else if(rows>cols){
	            		
	            		matrix[row][col] =  1 +  row * (matrix.length-1) + col;
		                System.out.printf("%d\t", matrix[row][col]);
	            		
	            	}else{
	            		matrix[row][col] =  1 +  row * (matrix.length+1) + col;
		                System.out.printf("%d\t", matrix[row][col]);
	            	}
	            }
	            System.out.println();
	        }
	          
	    
	    

    }


}
