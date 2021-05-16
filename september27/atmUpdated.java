
import java.util.Scanner;

public class atmUpdated
  {
   public static void main (String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter the password");
          
      // bank account related info
      int password = 143637;
      boolean validPW = false;
      double balance = 5000; 
     
      //check for valid password
      while (scanner.hasNextInt() == true)
      {      
       if (scanner.nextInt() == password)
        {
         validPW = true;
         break;
        }
       else
        {
         System.out.println("Incorrect password. Try again.");
        }
      }
     
      if (validPW == true)
       {
         System.out.println("Press 1 if you want to withdraw. Press 2 if you want to deposit.");
      
         if (scanner.nextInt() == 1)
         {
           System.out.println("How much would you like to withdraw?");
       
           // loop until the user has enters input 
           while (scanner.hasNextInt() == true) 
            {
              double amount = scanner.nextInt();
           
              if (amount > 300) // withdraw limit $300
              {
                System.out.println("You cannot withdraw more than $300! Enter a different amount");
              }
              else 
              {
                if (amount < balance)
                 {             
                   balance = balance - amount;
                   System.out.println("You have withdrew $" + amount + ". Your current balance is $" + balance);
                 }
                else
                 {
                   System.out.println("You cannot withdraw more than your current $" + balance);
                 }
                 break;
           }
       }
      }
      else
      {
       System.out.println("How much would you like to deposit?");
       double amount = scanner.nextInt(); 
          
          if (amount > 0)
          {
           balance = balance + amount;
           System.out.println("You have deposited $" + amount + ". Your current balance is $" + balance);
       }
      }
     }
      
      System.out.println("Would you like to complete another transaction? Press 1 for yes and 2 for no");
      int a = scanner.nextInt();
      
      int i; 
        for (i = a; i > 1; i++)
        {
      
            if (a == 1)
            {
                 System.out.println("hi");
            }
            if (a == 2)
            {
            }
         }

    scanner.close();
    
   }
   
}