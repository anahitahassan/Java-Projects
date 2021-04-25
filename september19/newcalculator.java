import java.util.Scanner;

// ok the issue with this program is when I ask it to rerun, it just keeps going and won't ask me again (yess or no) if I want the program to rerun. 

public class newcalculator 
{
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
        
      System.out.print("Press 1 if you are inputting integers, press 2 if you are inputting decimals");
      int input = scanner.nextInt(); 
      

      if ( input == 1 )
          { 
               System.out.print("Enter first integer:");
               int a = scanner.nextInt();
        
               System.out.print("Enter second integer:");
               int b = scanner.nextInt();
        
               System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, and 5 for remainder ");
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
      
  else if ( input == 2 )
         {
              System.out.print("Enter first decimal number:");
              double a = scanner.nextDouble();
        
              System.out.print("Enter second decimal number:");
              double b = scanner.nextDouble();
        
              System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division");
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

        // run program again?  
        
        System.out.print("Would you like to run the program again? Enter 1 for yes and 2 for no");
        int run = scanner.nextInt();

        if ( run == 1 )
         
          {System.out.println("Would you like to run the program again? Your Answer: Yes");
             while ( run == 1)
             { 
             /// run program again
             
               Scanner scannerr = new Scanner(System.in);
        
               System.out.print("Press 1 if you are inputting integers, press 2 if you are inputting decimals");
               int inputt = scannerr.nextInt(); 
               

               if ( inputt == 1 )
                  { 
                   System.out.print("Enter first integer:");
                   int a = scannerr.nextInt();
        
                   System.out.print("Enter second integer:");
                   int b = scannerr.nextInt();
        
                   System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, and 5 for remainder ");
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
                   System.out.print("Enter first decimal number:");
                   double a = scannerr.nextDouble();
        
                   System.out.print("Enter second decimal number:");
                   double b = scannerr.nextDouble();
        
                   System.out.print("Enter an operator: press 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division");
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
             
             //end of re-run program
             scannerr.close();
             }
           
          }
        
        else if ( run == 2 )
         
        {System.out.println("Would you like to run the program again? Your Answer: No");}

        scanner.close();
        
    }        
}       
   
         

    