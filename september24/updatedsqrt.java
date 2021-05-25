import java.util.Scanner;
    
public class updatedsqrt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a number ");
        int userInput = scanner.nextInt();
              
        if (userInput <= 3)
        {
            System.out.println ("Square root is ROOT  " + userInput);
        }
        else
        {
            int i = 2;
            int input = userInput;
            int outside = 1;
            int inside = 0;
            String printStatement = "";

            while ( (i * i) <= input )
            {
                int quotient = input / (i * i);
               
                if (input == (i * i)) 
                {
                    outside = outside * i;
                } 

                if (input % (i * i) == 0)
                {

                    outside = outside * i; 
                    i = 1; 
                    input = quotient;                
                }
                i++;
            }

            if (input % (i * i) > 0) 
            {
                inside = input;
            }
            
            if (inside == 0)
            {
                printStatement = "Square root is " + outside;
            }
            else
            {
                if (outside == 1)
                    printStatement = "Square root is ROOT  " + inside;
                else
                    printStatement = "Square root is " + outside + "  ROOT  " + inside;
                    
            }

            System.out.println (printStatement); 
            
        }

        scanner.close();
    }  
    
}
