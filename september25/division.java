import java.util.Scanner;

public class division
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
      
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        
        int s = a / b; // getting the "main" number
        int r = a % b; // getting the remainder (which will be a whole number)
        int q = (r * 10)/ b; // in 'mixed' fractions the remainder is divided by 
        
        if (r == 0)
        {
            System.out.println("The answer is " + a/b);
        } 
        
        else
        {
            System.out.println("The answer is " + s + "." + q);
        }
        
        scanner.close();
    }
}
       