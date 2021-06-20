public class introToMethods
{
    // 'main' method
    public static void main(String[] args)
    {
        // calling a method: 
        counter();
        
        // method where you can pass a variable: 
        int e = 10;
        counterStatement(e);
    }

    public static void counter()
    {
        int x = 1;
        while( x < 9)
        {
            System.out.print(x + ", ");
            x++;
            if (x == 10)
            {
                System.out.print(x);
            }
        }
        System.out.println();
    }

    public static void counterStatement(int var)
    {
        if (var > 9)
        {
            System.out.println("I love cheese.");
        }
    }
    
}
