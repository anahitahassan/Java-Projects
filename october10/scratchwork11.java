import java.util.*;

public class scratchwork11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator of the first number");
        int a = scanner.nextInt();
        
        System.out.println("Enter denominator of the first number");
        int b = scanner.nextInt();
        
        System.out.println("Enter numerator of the second number");
        int c = scanner.nextInt();
        
        System.out.println("Enter denominator of the second number");
        int d = scanner.nextInt();
        
        System.out.println("Pick an operation: enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
        int operation = scanner.nextInt();
        
        if ( operation == 1 )
            //only addition
        { 
            if (b == d) 
                //same denominator, simply adds the numerators
            { 
                int top = a + c; 
                int bottom = b;
                
                System.out.println(stuff(top,bottom));
            }
            else 
                //different denominators, cross multipies and adds
            { 
                
                int top = (a*d) + (b*c);
                int bottom = (b*d);
                
                System.out.println(stuff(top,bottom));
            }
        }

        scanner.close();
    }
        
   public static int stuff(int top, int bottom)
    {
       int x = top % bottom;
           
       if ( x == 0);
       {
            //remainder = 0 --> divisible
            int y = top/bottom;
            return(y);
       }
    }
}

    