/*
 * @author: Anahita Hassan
 */
import java.util.Scanner;

public class sept27
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the 1st number");
        int a = scanner.nextInt();
      
        System.out.println("Enter the 2nd number");
        int b = scanner.nextInt();
        
        int s = a / b;
        int r = a % b;
        int q = (r * 10)/ b;
        
        if (r == 0)
        {
            System.out.println("The answer is " + a/b);
        } 
        
        else
        {
            System.out.println("The answer is " + s + "." + q);
        }
                  
    }
}
       