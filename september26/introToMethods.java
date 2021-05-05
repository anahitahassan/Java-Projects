public class introToMethods
{
    public static void main(String[] args)
    {
        counter();
        counter();
    }
    
    public static void counter()
    {
        int x = 1;
        while( x < 21)
        {
            System.out.print(x + ", ");
            x++;
        }
        System.out.println();
    }
    
}