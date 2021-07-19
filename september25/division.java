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
        int q = (r * 10)/ b; // in 'mixed' fractions the remainder is divided by the original divider
        // but we also need to multiply by 10 because we want whole number, not decimal. 

        // say we want 7/3
        // s = 2
        // r = 1
        // fraction part of 'mixed' fraction is 1/2 but we don't want 0.5
        // we want 5, not 0.5, so we *10

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
       