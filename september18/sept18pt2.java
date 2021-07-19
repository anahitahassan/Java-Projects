import java.util.*;

public class sept18pt2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your 1st number.");
        int a = input.nextInt();
        
        System.out.println("Please enter your 2nd number.");
        int b = input.nextInt();
        
        System.out.println("Please enter your 3rd number.");
        int c = input.nextInt();
        
        System.out.println((-b + (Math.sqrt((b*b)-4*a*c)))/2*a);
        System.out.println((-b - (Math.sqrt((b*b)-4*a*c)))/2*a);
        
        System.out.println("Please enter a number to see if it is even, odd, or 0");
        int p = input.nextInt();
        
        int r = p % 2; // % module is a good indicator of if a number is even or odd because when r =/= 0, it must be odd
        
        if (r == 0)
        System.out.println("even");
        
        else 
        System.out.println("odd");
        
        if (p > 0)
        System.out.println("positive");  
        
        else if (p < 0)
        System.out.println("negative");
        
        else if (p == 0)
        System.out.println("0");
  
        input.close();
    }
}