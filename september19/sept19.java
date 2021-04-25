import java.util.Scanner;
 
public class sept19
{
    public static void main(String[] args)
    {
        // Prompts the user
        System.out.println("Enter the upper limit");
           
        // Read the user's upper limit
        Scanner scanner = new Scanner(System.in); 
        int upperLimit = scanner.nextInt();
        int i = 1;

        while ( (7 * i) < upperLimit || (3 * i) < upperLimit)
        {
            if ( (3 * i) < (7 * i) )
            {
                System.out.print(" " + 3 * i  + " " +  7 * i  + " ");
            }
            else
            {
                System.out.print(" " + 7 * i  + " " +  3 * i  + " ");
            }
            i++;   
        }   
        scanner.close();       
    }
}