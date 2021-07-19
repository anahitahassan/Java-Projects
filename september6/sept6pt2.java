
public class sept6pt2
{
   //conditional statements
   //loops
    public static void main(String[] args)
    {
        int x; 
        x = 19; 
    
        while (x < 100)
        {
            System.out.print(x + ", ");
            x = x + 1;
        }

        // now before I run this, let's think about what happens. 
        // x is 19, which is less than 100, so 19 is printed, but now x is 20. 
        // x is 20, which is less than 100, so 20 is printed, but now x is 21. 
        // this happens until x is 99. 
        // so what's printed is "19, 20, 21, ... 99, "
    }
}