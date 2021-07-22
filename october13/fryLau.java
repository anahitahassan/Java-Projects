/**
 * This program  takes in 5 inputs and sends them all to these following methods:
 * mean()
 * median()
 * mode()
 * The methods print out the values. Arrays are not allowed.
 *  
 * (Mr. Jan's note: Assume that I will only test your code with a sample group that contains only one mode.)
 * 
 * @author: Anahita Hassan (AP Computer Science A, Mr. Jan, Period 1)
 */

import java.util.Scanner;

public class fryLau 
{
   public static void main(String[] args) 
   {  
      double mean;
      int median;
      int mode;
      int temp;
      
      // Prompts the user to enter 5 numbers (assuming all are integers)
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter the 1st number");
      int num1 = scanner.nextInt();
      
      System.out.println("Enter the 2nd number");
      int num2 = scanner.nextInt();
      
      System.out.println("Enter the 3rd number");
      int num3 = scanner.nextInt();
      
      System.out.println("Enter the 4th number");
      int num4 = scanner.nextInt();
      
      System.out.println("Enter the 5th number");
      int num5 = scanner.nextInt();
      
      // sort the numbers in ascending order
      for (int count = 0; count < 4; count++)
      {
         // bubble sort: 
         if (num2 < num1)
         {
            temp = num1;
            num1 = num2;             
            num2 = temp;
         }

         if (num3 < num2)
         {
            temp = num2;
            num2 = num3;
            num3 = temp;
         }

         if (num4 < num3)
         {
            temp = num3;
            num3 = num4;
            num4 = temp;
         }

         if (num5 < num4)
         {
            temp = num4;
            num4 = num5;
            num5 = temp;
         }
      }
      
      // Now all 5 inputs are in ascending order : num1 < num2 < num3 < num4 < num5
      System.out.println("Numbers in order: " +num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "\n");
      
      // calling the methods below. 
      // find the mean 
      mean = mean(num1, num2, num3, num4, num5);
      // find the median
      median = median(num1, num2, num3, num4, num5);
      // find the mode
      mode = mode(num1, num2, num3, num4, num5);
      
      // print out the values for mean, median and mode
      System.out.println("mean = " + mean); 
      System.out.println("median = " + median); 
      if (mode != -1)
      {
         System.out.println("mode = " + mode);
      }
      else
      {
         System.out.println("There is no mode");
      }
      
      scanner.close();
   }
      
   public static double mean(int n1, int n2, int n3, int n4, int n5)
   {
      // to find mean, just add up all 5 numbers and divide them by 5
      double m = (double)(n1 + n2 + n3 + n4 + n5) / 5; // typecast to double to get accurate 'mean'
      return m;
   }
      
   public static int median(int n1, int n2, int n3, int n4, int n5)
   {
      // 5 numbers in order, so 3rd one will be the median
      return n3;
   }
      
      
   public static int mode(int n1, int n2, int n3, int n4, int n5)
   {  
      int m = -1;
      
      // since there can be only one mode among the 5 numbers
      if (n1 == n2 || n1 == n3 || n1 == n4 || n1 == n5)
      {
         m = n1;
      }
      else if (n2 == n3 || n2 == n4 || n2 == n5)
      {
         m = n2;
      }
      else if (n3 == n4 || n3 == n5)
      {
         m = n3;
      }
      else if (n4 == n5)
      {
         m = n4;
      }

      return m;
   }
}
