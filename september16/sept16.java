import java.util.*;

public class sept16
{
    public static void main(String[] args)
    {
        Scanner project = new Scanner(System.in);
        System.out.println("Please enter a number.");
    
        int i;
        int j;
        int a = project.nextInt();
        for (i = 1; i <= a; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // how does this program work: 
        // i and j are initilized but not declared until the for loop
        

    }
}