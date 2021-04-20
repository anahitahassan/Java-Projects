//square root project due next thurs 9/19/19

import java.util.Scanner;

public class srproj 
{
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