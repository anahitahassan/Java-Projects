import java.util.Scanner;

public class calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Press 1 if you are inputting integers, press 2 if you are inputting decimals. ");
        int input = scanner.nextInt(); 
        
        // OPTION 1: INTEGERS ONLY
        if ( input == 1 )
        { 
            System.out.print("Enter first integer: ");
            int a = scanner.nextInt();
            
            System.out.print("Enter second integer: ");
            int b = scanner.nextInt();
            
            System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, and 5 for remainder. ");
            int operator = scanner.nextInt();
                
            //operation
            if ( operator == 1 )
            {System.out.println( a + b );}  
            
            else if ( operator == 2 )
            {System.out.println( a - b);}
            
            else if ( operator == 3 )
            {System.out.println( a * b);} 
                
            else if ( operator == 4 )
            {System.out.println( a / b);} 
        
            else if ( operator == 5 )
            {System.out.println( a % b);}
        }
 
        // OPTION 2: DECIMALS ONLY
        else if ( input == 2 )
        {
            System.out.print("Enter first decimal number: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter second decimal number: ");
            double b = scanner.nextDouble();
            
            System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division. ");
            int operator = scanner.nextInt();
                
            //operation
            if ( operator == 1 )
            {System.out.println( a + b );}
                
            else if ( operator == 2 )
            {System.out.println( a - b);}
            
            else if ( operator == 3 )
            {System.out.println( a * b);}
        
            else if ( operator == 4 )
            {System.out.println( a / b);}     
        }

        // Run program again?  
        System.out.print("Would you like to run the program again? Enter 1 for yes and 2 for no. ");
        int run = scanner.nextInt();
        
        if ( run == 1 )
        {
            System.out.println("Would you like to run the program again? Your Answer: Yes. ");

            while ( run == 1)
            { 
                // Run program again
                
                Scanner scannerr = new Scanner(System.in);

                System.out.print("Press 1 if you are inputting integers, press 2 if you are inputting decimals. ");
                int inputt = scannerr.nextInt(); 

                if ( inputt == 1 )
                { 
                    System.out.print("Enter first integer: ");
                    int a = scannerr.nextInt();
            
                    System.out.print("Enter second integer: ");
                    int b = scannerr.nextInt();
            
                    System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, and 5 for remainder. ");
                    int operator = scannerr.nextInt();
                
                    //operation
                    if ( operator == 1 )
                    {System.out.println( a + b );}  
            
                    else if ( operator == 2 )
                    {System.out.println( a - b);}
            
                    else if ( operator == 3 )
                    {System.out.println( a * b);} 
                
                    else if ( operator == 4 )
                    {System.out.println( a / b);} 
        
                    else if ( operator == 5 )
                    {System.out.println( a % b);}
            
                }
        
                else if ( inputt == 2 )
                {
                    System.out.print("Enter first decimal number: ");
                    double a = scannerr.nextDouble();
            
                    System.out.print("Enter second decimal number: ");
                    double b = scannerr.nextDouble();
            
                    System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division. ");
                    int operator = scannerr.nextInt();
                
                    //operation
                    if ( operator == 1 )
                    {System.out.println( a + b );}
                
                    else if ( operator == 2 )
                    {System.out.println( a - b);}
            
                    else if ( operator == 3 )
                    {System.out.println( a * b);}
        
                    else if ( operator == 4 )
                    {System.out.println( a / b);}
                    
                }
            
                scannerr.close();
                // end of re-run program
                // end of while loop
            }
            
            // end of if statement
        }
            
        else if ( run == 2 )
        {System.out.println("Would you like to run the program again? Your Answer: No. ");}

        scanner.close();

        // OK this would not have been an ideal way to re-run the program. 
        // Granted I was a beginner when I made this calculator and I didn't know methods existed.
        // The biggest issue about this is that it just copies previous code and you can only rerun the program once rip lol
        // Also another note: Making new variables scanner and scannerr or input and inputt is so weird lmfao i need to come up with better naming convensions
        
    }      
}       
   
         

    