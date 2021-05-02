// this is an updated version of september23/atm.java
// here you have a starting balance of 5000
// you can withdraw and deposit as many times as you want and the balance will change accordingly. 

import java.util.Scanner;

public class updatedatm
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
            
        // define and initialize variables
        int password = 143637;
        double balance = 5000;
        int input = 0;
        
        boolean validPW = false;
        boolean option1 = false;
        boolean option2 = false;
        boolean transaction = false; // every new transaction sets it to true
        
        //check for valid password
        while (scanner.hasNextInt() == true)
        {
            // password is correct
            if (scanner.nextInt() == password)
            {
                validPW = true;
                transaction = true;
                break;
            }
            // password is incorrect, so loop back
            else
            {
                System.out.println("Incorrect password. Please try again.");
            }
        }
        
        while (validPW == true)
        {
            // begin transaction
            if (transaction == true)
            {
                System.out.println("Press 1 if you want to withdraw. Press 2 if you want to deposit.");
                // check for the option 1 or 2
                input = scanner.nextInt();
                if (input == 1)
                {
                    option1 = true;
                    System.out.println("How much would you like to withdraw?");
                }
                else if (input == 2)
                {
                    option2 = true;
                    System.out.println("How much would you like to deposit?");        
                }
                else
                {
                    System.out.println("Invalid Option.");
                }
            }
            
            // user entered 1 for withdraw
            if (option1 == true)
            {
                double amount = scanner.nextInt();
                
                if (amount > 300) // withdraw limit $300
                {
                    System.out.println("You cannot withdraw more than $300! Enter a different amount");
                    transaction = false;
                }
                else 
                {
                    if (amount < balance)
                    {             
                        balance = balance - amount;
                        System.out.println("You have withdrew $" + amount + ". Your current balance is $" + balance);
                        
                        System.out.println("Would you like another transaction? Press 1 for YES, 2 for NO.");

                        if (scanner.nextInt() == 2)
                        {              
                            break;
                        }
                        // reset all checks for fresh transaction
                        transaction = true;
                        option1 = false;
                        option2 = false;
                    }
                    else
                    {
                        System.out.println("You cannot withdraw more than your current balance $" + balance);
                        transaction = false;
                    }            
                }
            }
            // user entered 2 for deposit
            if (option2 == true)
            {        
                double amount = scanner.nextInt(); 
                
                if (amount > 0)
                {           
                    balance = balance + amount;
                    System.out.println("You have deposited $" + amount + ". Your current balance is $" + balance);
                    
                    System.out.println("Would you like another transaction? Press 1 for YES, 2 for NO.");
                    
                    if (scanner.nextInt() == 2)
                    {
                        transaction = false;
                        break;
                    }
                    // reset all checks for fresh transaction
                    transaction = true;
                    option1 = false;
                    option2 = false;
                }
            }             
        }     

        scanner.close();
    }
}     
