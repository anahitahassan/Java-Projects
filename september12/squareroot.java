// square root project due next thurs 9/19/19
// I'm re-doing this project by myself 4/18/21

import java.util.Scanner;

public class squareroot 
{
    // this is our first time using a method! 
    // int num is passed though this method
    // it is first divided by 2. 
    public static int main (int num)
    {
        int a;
        int sr = num / 2;
        
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
        
        System.out.print("Enter any number:");
        Scanner scanner  = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        
        System.out.println("Square root of " + number + " is: " + main(number));
        
    }
  
}