public class midpoint
{
    public static void main(String[] args)
    {
        boolean midpoint = Midpoint (-1, 3, 2, 6);
        System.out.println(midpoint);     
    }
    
    public static boolean Midpoint(int x1, int x2, int y1, int y2)
    {
        double x = (double)(x1 + x2)/2;
        double y = (double)(y1 + y2)/2;
        System.out.println("(" + x + "," + y + ")"); 
        
        // this boolean part is just to check if the midpoint is in the Quadrant 1 (and is whole numbers...)
        if ( x % 1 == 0 && y % 1 == 0 && x >= 0 && y >= 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
        
    } 
   
}
        
        
        