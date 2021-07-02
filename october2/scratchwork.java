import java.util.*;

public class scratchwork
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
        int op = scanner.nextInt();
        
        if ( op == 1 )
            //only addition
        { 
            if (b == d) 
                //same denominator, simply adds the numerators
            { 
                String name = ((a+c)+ "/" + b); 
            }
            
            // say a = 2; b = 7; c = 4; d = 7; and op = 1
            // 2/7 + 4/7 = 6/7 
        }
        
        System.out.print(name);
        
    }
    
}