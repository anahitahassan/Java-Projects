import java.util.*;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner project = new Scanner(System.in);
        System.out.println("Please enter a number.");
    
        int i;
        int j = 1;
        int a = project.nextInt(); 
        for (i = a; i >= 1; i--) 
        {
            j*=i;
            //j = j * i;
        }
        
        project.close();

        System.out.println(j);
    }
}