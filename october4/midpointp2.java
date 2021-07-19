// this file is identical to the midpoint.java file
public class midpointp2
{
    public static void main(String[] args)
    {
        boolean midpoint = Midpoint (-1, 4, 5, -6);
        System.out.println(midpoint);     
    }
    
    public static boolean Midpoint(int x1, int x2, int y1, int y2)
    {
        double x = (double)(x1 + x2)/2;
        double y = (double)(y1 + y2)/2;
        System.out.println("(" + x + "," + y + ")"); 
        

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
        
        
        