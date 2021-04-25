import java.util.*;

public class sept18 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an upper bound.");

        int i;
        int j = 1;
        int v = input.nextInt();
        input.close();

        for (i = v; i > 1; i++) 
        {
            j = 3 * i;
        }
        
        System.out.println(j);

        // i is set equal to the input from the user, and as long as i remains larger than 1, 
        // j, which is initally 1, will be multiplied by 3
        // this will happen an infinite number of times because i is incremented

    }
}
