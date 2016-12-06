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
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] randomNumbers = new int[6];
        int[] numbers = new int[6];
        int correctCount = 0;
        int temp;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 6 numbers: ");

        while (true) {
            temp = s.nextInt();
            if (temp < 1 || temp > 47) {
                System.out.println("Only between 1 and 47!");
                continue;
            } else {
                numbers[correctCount] = temp;
                correctCount++;
            }

            if (correctCount == 6) {
                break;
            }
        }

        for (int i = 0; i < correctCount; i++) {
        }
        System.out.printf("Lotto numbers:\n");
        for (int j = 0; j < randomNumbers.length; j++) {
            randomNumbers[j] = new java.util.Random().nextInt(46) + 1;
            System.out.print("\t" + randomNumbers[j]);
        }
        int count = 0;
        int j = 0;
        int guessed = 0;
        if (temp == randomNumbers[j]) {
            count += guessed;
        }
        System.out.println("\nYou guessed " + count + " numbers!");
    }
}
