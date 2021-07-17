/*
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

public class oct12p2
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
                System.out.print(simplify (top, bottom));
            }
            else 
                //different denominators, cross multipies and adds
            { 
                
                int top = (a*d) + (b*c);
                int bottom = (b*d);
                System.out.print(simplify (top, bottom));
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
                System.out.println(simplify(top, bottom));
            }
            else 
                //different denominators, cross multipies and *subtracts
            { 
                int top = (a*d)-(c*b);
                int bottom = (b*d);
                System.out.println(simplify(top, bottom));
            }
        }
        
        if ( operation == 3 )
            //only multiply
        {
           int top = a*c;
           int bottom = b*d;
           System.out.println(simplify(top, bottom));     
        }
        
        if ( operation == 4 )
            //only divide
        {
           int top = a*d;
           int bottom = b*c;
           System.out.println(simplify(top, bottom));
        }
              
    }
    
    public static int simplify(int top, int bottom)
    {
       
      
     
    }
    
}
*/   


    

        
        