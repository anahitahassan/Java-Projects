// square root project due next thurs 9/19/19
// I'm re-doing this project by myself 4/18/21

import java.util.Scanner;

public class squareroot 
{
    public static void main(String[] args)
    {
        Scanner project = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = project.nextInt();
        project.close();
        
        double b;
        
        double sr = a / 2;
        
        b = sr; 
        while (( b - sr)!= 0 ); 
        {
            b = sr; 
            sr = ( b + (a / b)) / 2; 
        }
        System.out.println(sr);
    }
}