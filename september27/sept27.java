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

        scanner.close();

        // this program divides 1st number by second number. 
        // we have the base division section (liek 10/3 is 3.333 --> 3.)
        // to find the fraction part we just take the reminader and divide it by the divsor again
        // (remainder 1/3 --> 0.3)
        // we print those together with a "." in between. 
                  
    }
}
       
