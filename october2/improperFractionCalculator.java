/*  This file works well but I didn't write the code for the rest of the program. 
    This program takes 2 fractiosn and adds them. 
    So far, it only prints improper fractions, and only does addition. 
    My main focus should be making it work for proper fractions. 
    And I also need to make it work for subtraction, multiplication, and division. 
*/

import java.util.*;

public class improperFractionCalculator
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
        
        if ( op == 1 ) //only addition
        { 
            if (b == d) 
                //same denominator, simply adds the numerators
            { 
                String name = ((a+c)+ "/" + b); 
                System.out.print(name);
            }
            
            // say a = 2; b = 7; c = 4; d = 7; and op = 1
            // 2/7 + 4/7 = 6/7 
        }

        scanner.close();
    }   
}