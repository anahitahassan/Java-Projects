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
    }
}