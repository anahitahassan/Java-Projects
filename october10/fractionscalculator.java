//5 methods: add, sub, multiply, divide, simplify
//improper form
//can chose add, sub, etc..

//2nd project - FryLau
//5 inputs
//mean, median, mode
//run all 3
//all three must return answer back to main
// mode - assume only 1


//REMEMBER SIMPLIFY 

import java.util.*;

public class fractionscalculator
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
                int addition1 = top/bottom; 
                System.out.print(addition1);
            }
            else 
                //different denominators, cross multipies and adds
            { 
                
                int top = (a*d) + (b*c);
                int bottom = (b*d);
                int addition2 = top/bottom;
                System.out.print(addition2);
            }
        }
        
        if ( operation == 2 )
            //only subtraction
        {
            if (b == d) 
                //same denominator, simply subtracts the numerators
            { 
                int top = a-c;
                int bottom = b;
                //int sub1 = top/bottom;
                System.out.println(simplify(top, bottom));
            }
            else 
                //different denominators, cross multipies and *subtracts
            { 
                //int top = (a*d)-(c*b);
                //int bottom = (b*d);
                //int sub2 = top/bottom;
            }
        }
        
        if ( operation == 3 )
            //only multiply
        {
           //int mult = (a*c)/(b*d); 
           
        }
        
        if ( operation == 4 )
            //only divide
        {
           //int divide = (a*d)/(b*c); 
        }
        
        scanner.close();
    }
    
    public static int simplify(int top, int bottom)
    {
       int x = top%bottom;
           
       if ( x == 0);
       {
           //remainder = 0 --> divisible
           int y = top/bottom;
           return(y);
       }
    }
}       