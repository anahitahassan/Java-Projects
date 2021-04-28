public class sept23
{
    public static void main (String [] args)
    {
        //1. what does following quote print
        int i = 5;
        while (i == 0)
        {
            System.out.println(i);
            i++;
        }
        
        //prints: 5
        //4
        //3
        //2
        //1
    
        //2. whats wrong with the code
        int a = 5; 
        while (a >= 0)
        {
            System.out.println(a);
            a = (3 * a + 25)/2;
        }

        //prints i=5, i=20, i=42, keeps goin forever -- infinite loop

    }
}