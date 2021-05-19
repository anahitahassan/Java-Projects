import java.util.*;

public class sept30
{
    public static void main(String[] args)
    { 
        int x = 3;
        int y = 9;
        int z = add(x,y);
        System.out.println(z);

        System.out.println(add(100,100));
    }

    public static int add(int a, int b)
    {
        int answer = a + b;
        return answer;
        
    }
    
}