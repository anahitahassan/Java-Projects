import java.util.*;

public class isprime
{  
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        scanner.close(); 
            
        int r = 0;
        boolean numberIsPrime = true;
            
        for (int i = 2; i <= (a / 2); i++)
        {
            r = a % i;
            if( r == 0)
            {
                numberIsPrime = false;
            }
        }
        
        // Statements
        if (numberIsPrime == true)
        {
            System.out.println (a + " is a prime.");
        }
        
        else
        {
            System.out.println (a + " is not a prime.");
        }     
        
        // say the user inputs 11. 
        // we set r equal to 11 % 2, which is 1. 
        // numberIsPrime is still true. 
        // now i is 3: (and i < 11/2 = 5)
        // r is now 11 % 3 which is 2. 
        // numberIsPrime is still true. 
        // now i is 4: (and i < 11/2 = 5)
        // r is now 11 % 4 which is 3. 
        // numberIsPrime is still true. 
        // now i is 5: (and i <= 5), this will be last iteration
        // r is now 11 % 5 which is 1
        // we are out of the for loop and numberIsPrime is still true.
        // so we say a is prime. 
        // for any number, we find the remained of that number and i, which increments 2, 3, 4, 5, 
        // all the way up until half of the number. 
        // if at any time the remainer is 0, we say it isn't prime. 
    }
}