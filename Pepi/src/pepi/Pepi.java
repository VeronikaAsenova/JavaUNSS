/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepi;

/**
 *
 * @author Veronika
 */
public class Pepi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      decimal checkSum = decimal.Parse(Console.ReadLine());
            int friends = int.Parse(Console.ReadLine());
            decimal moneyCollected = 0;
            decimal checkDifference = 0;
 
            for (int i = 0; i < friends; i++)
            {
                decimal addMoney = decimal.Parse(Console.ReadLine());
 
                moneyCollected += addMoney;
            }
 
            Console.WriteLine($"Paid: {moneyCollected}");
 
            if (moneyCollected < checkSum)
            {
                checkDifference = checkSum - moneyCollected;
                Console.WriteLine($"{checkDifference:N2} leva left to pay the bill");
            }
 
            else
            {
                checkDifference = moneyCollected - checkSum;
                Console.WriteLine($"Tip: {checkDifference:N2}");
            }
        }
    }
    }
    
}
