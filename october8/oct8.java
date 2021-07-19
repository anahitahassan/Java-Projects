public class oct8
{
    public static void main(String[] args )
    {
        int a = 5;
        int b = 6;
        System.out.println(add(a, b));
        System.out.println(mult(a, b));
    }
   
    public static int add(int a, int b)
    {
        int c = a + b; 
        return c; 
    } 
    
    public static int mult(int a, int b)
    {
        int i = a;
        int j;
        int d = 0;
        for( j = 1 ; j <= b ; j++) 
        {
            d = i + d;
        }
        return d;
    }

}