// square root project due next thurs 9/19/19
// THIS FILE WORKS!!!!!!!!!!!!!!!!

import java.util.Scanner;

public class sqroot 
{
    public static int main (int num)
    {
        int sr = num / 2;
        int temp;
        do 
        {
            temp = sr; 
            sr = ( temp + (num / temp)) / 2;
        }
        while (( temp - sr)!=0 ); 
        return sr; 

        // Example: say num = 81
        // int sr = num / 2 => 81/2 = 40
        // int temp = 40
        // sr = (40 + (81/40))/2 => (40+2)/2 => 21
        // while (40-21)=19= !=0 --> this statement is true still. 
        
        // Again...
        // temp = 21
        // sr = (21 + (81/21))/2 => (21+3)/2 => 12
        // while (21-12)=9= !=0 --> this statement is true still. 
        
        // Again...
        // temp = 12
        // sr = (12 + (81/12))/2 => (12 + 6)/2 => 9
        // while (12-9)=3= !=0 --> this statement is true still. 
        
        // Again...
        // temp = 9
        // sr = (9+(81/9))/2 => (9+9)/2 => 9 (Ayyyy look at that)
        // while (9-9)!=0 --> this statement is finally false!

        // so we return sr which is 9. 

        // I don't have the slightest


    }
    public static void main(String[] args)
    {
        String yesno = "yes";
        while (yesno == "yes")
        {
            System.out.print("Enter any number:");
            Scanner scanner  = new Scanner(System.in);
            int number = scanner.nextInt();
            
            System.out.println("Square root of " + number + " is: " + main(number));

            System.out.println("Print 'yes' if you would like to re-run program and 'no' if you would not like to re-run.");
            String user = scanner.next();

            if (user.equals("no"))
            {
                yesno = "no";
                scanner.close();
                System.out.println("End of program");
            }
        }
        
        
    }
}