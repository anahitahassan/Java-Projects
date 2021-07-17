import java.util.*;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner project = new Scanner(System.in);
        System.out.println("Please enter a number.");
        
        int a = project.nextInt();
        project.close();

        int i;
        int j = 1;
     
        for (i = a; i >= 1; i--) 
        {
            j*=i;
            //j = j * i;
        }

        System.out.println(j);

        // Say for example a = 5. j = 1 and i = 5, for the first iteration. 
        // j is now = j*i = 1*5 = 5. 
        // for the second iteration, i = 4, which is greater than or equal to 1. 
        // j is now = 5*4 = 20. 
        // for the third iteration, i = 3
        // j is now = 20*3 = 60
        // for the fourth iteration, i = 2 
        // j is now = 60*2 = 120
        // for the fifth iteration, i = 1 (this is the last iteration)
        // j is now = 120*1 = 120. Thus 120 is printed. 

    }
}