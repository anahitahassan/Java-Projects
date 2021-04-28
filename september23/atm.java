// This would be a lot cooler if we could constantly withdraw and deposit and the starting/initial balance would change accordingly

import java.util.Scanner;

public class atm
{
    public static void main (String[] args)
    {
        //ATM
        //password: 143637
        
        //starting balance: $5000
        //ability to withdraw, deposit
        //limit for withdrawing: $300/transaction
        //limit for deposit: as much as you want
        //loop until user is done
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the password");
        int ps = scanner.nextInt();
        
        if (ps == 143637)
        {
            System.out.println("Press 1 if you want to withdraw. Press 2 if you want to deposit.");
            int w_or_d = scanner.nextInt();
            
            // W I T H D R A W
            if (w_or_d == 1)
            {
                System.out.println("How much would you like to withdraw?");
                double with = scanner.nextInt();
                
                if ( with > 300 )
                {
                    System.out.println("You cannot withdraw that amount. It exceeds the limit of $300.");
                }

                else if (with <= 300 )
                { 
                    System.out.println("You have withdrew $" + with);
                }
                
            }
            
            // D E P O S I T
            else if (w_or_d == 2)
            {
                System.out.println("How much would you life to deposit?");
                double depo = scanner.nextInt(); 
                
                if ( depo > 0 )
                {
                    System.out.println("You have deposited $" + depo);
                }
                
            }
            
            else
            {
                System.out.println("Error");
            }
        }
        
        else 
        {
            System.out.println("Incorrect password. Try again.");
        }

        scanner.close();
        
    }
  
}