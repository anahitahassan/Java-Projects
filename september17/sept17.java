import java.util.*;

public class sept17
{
    public static void main(String[] args)
    {
        Scanner project = new Scanner(System.in);
        System.out.println("Please enter a number.");
        
        int i;
        int j = 1;
        int a = project.nextInt(); 
        project.close();

        for (i = a; i > 1; i--) 
        {
            j = j * i;
        }
        System.out.println(j);

        // what happens here (lets say a = 4)
        // i isn't declared until the for loop - it is set equal to 4 there. 
        // j is set equal to 1 and it is the var that changes (also i from iteration)
        // first iteration: i = 4: j is set equal to (1)*(4) = 4. 
        // second iteration: i = 3: j is set equal to (4)*(3) = 12. 
        // third iteration: i = 2: j is set equal to (12)*(2) = 24. 
        // no more iterations since i > 1 and so the last iteration was i = 2. 
        // after the for loop, j is printed --> 24. 
    }
}