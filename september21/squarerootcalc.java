/**
 * The program takes user input from the keyboard and calculates square root 
 * of any number, then prints it out in the simplest radical form.
 * 
 * @author: Anahita Hassan (AP Computer Science A, Mr. Jan, Period 1)
 */

import java.util.Scanner;
    
public class squarerootcalc
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        // prompt the user
        System.out.println("Enter a number ");
        // read the user input
        int orgInput = scanner.nextInt();
        // close the scanner
        scanner.close();
           
        // in case of input = 1,2,3
        if (orgInput <= 3)
        {
            System.out.println ("Square root is root  " + orgInput);
        }
        else
        {
            // counter is initialized to 2
            int i = 2;
            // store original input value
            int input = orgInput;
            // simplest form = sqRootPart + "root" + radicalPart ( 8 -> 2 root 2 )
            int sqRootPart = 1;
            int radicalPart = 0;
            String printStatement = "";

            // run user input through the loop
            while ( (i * i) <= input )
            {
                int quotient = input / (i * i);
                
                // input is a perfect square
                if (input == (i * i)) 
                {
                    sqRootPart = sqRootPart * i;
                    break;
                } 
                // input is divisble by i*i
                if (input % (i * i) == 0)
                {
                    // so input is divisble by i*i, now work with quotient to factor it
                    // meaning run the quotient through the 'while' loop 
                    
                    sqRootPart = sqRootPart * i; // save i as sq root
                    i = 1; // reset the counter
                    input = quotient; //set input to quotient                 
                }
                i++;
            }
            // input is not divisible by any number, set the radical part
            if (input % (i * i) > 0) 
            {
                radicalPart = input;
            }
            
            // set up the square root in simplest form
            if (radicalPart == 0)
            {
                printStatement = "Square root is " + sqRootPart;
            }
            else
            {
                if (sqRootPart == 1)
                    printStatement = "Square root is root  " + radicalPart;
                else
                    printStatement = "Square root is " + sqRootPart + "  root  " + radicalPart;
                    
            }
            // finally print out the square root in simplest form
            System.out.println (printStatement);            
        }
    }    
}