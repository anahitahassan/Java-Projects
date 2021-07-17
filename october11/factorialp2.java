public class factorialp2
{
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println(add(x));
    }  
    public static int add(int a)
    {
        int i;
        int j = 1;
        for (i = a; i >= 1; i--) 
        {
            j*=i;
            //j = j * i;
        }
        return j;
    }
 
}