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
    }
    public static void main(String[] args)
    {
        String yesno = "yes";
        do
        {
            System.out.print("Enter any number:");
            Scanner scanner  = new Scanner(System.in);
            int number = scanner.nextInt();
            
            System.out.println("Square root of " + number + " is: " + main(number));

            System.out.println("Print 'yes' if you would like to re-run program and 'no' if you would not like to re-run.");
            String user = scanner.nextLine();

            if (user == "no")
            {
                yesno = "no";
                scanner.close();
                System.out.println("End of program");
            }
        }
        while (yesno == "yes");
        
    }
}