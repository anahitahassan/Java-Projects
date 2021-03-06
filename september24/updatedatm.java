// this is an updated version of september23/atm.java
// here you have a starting balance of 5000 and you can withdraw and deposit as many times as you want and the balance will change accordingly. 

import java.util.Scanner;

public class updatedatm
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password. ");
            
        // define and initialize variables
        int password = 143637;
        double balance = 5000;
        int input = 0;
        
        boolean validPW = false;
        boolean option1 = false;
            // set to true when we want to withdraw
        boolean option2 = false;
            // set to true when we want to deposit
            // note: option1, option2 are set back to false at end for fresh transaction
        boolean transaction = false; 
            // every new transaction sets it to true
            // if PW is correct, this var is set to true, and we can begin withdraw/deposit. 
        
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
        
        // all of the main 'transaction stuff' happens while validPW == true. 
        // as indicated above, we can't even reach this portion of the program until a correct PW has been entered. 
        while (validPW == true)
        {
            // begin transaction, ask withdraw/deposit?
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
            
            // responding to question of withdraw/deposit? : 

            // user entered 1 for withdraw
            if (option1 == true)
            {
                double amount = scanner.nextInt();
                
                if (amount > 300) // withdraw limit $300
                {
                    System.out.println("You cannot withdraw more than $300! Enter a different amount");
                    transaction = false; 
                    // if we don't say this, then the program goes back to withdraw/deposit Q (which happens when transaction == true)
                    // we need to keep transaction false so that doesn't happen
                    // in other words, still having transaction = true allows for fresh transaction. 
                    // having transaction = false lets us stay in this transaction
                    // also recall that we are still in a while loop that should last forever as long as PW is valid
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
