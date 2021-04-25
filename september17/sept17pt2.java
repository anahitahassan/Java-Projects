
import java.util.*;

public class sept17pt2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        
        int a = input.nextInt();
        input.nextLine();
        
        int answer = a;
        a--;
        
        while( a > 0 )
        {
            answer *= a;
            a--;
        }
        
        System.out.println(answer);
        input.close();
    }
}