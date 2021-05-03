public class sept25
{
    public static void main(String[] args)
    { 
        //int x = 98;
        //double y = 55.34;
        
        // turns int into double
        
        //double xprime = x;
        //System.out.println(xprime);
        
        
        //int yprime = (int)y;
        //System.out.println(yprime);
        
        //turms double into integer, cuts off the decimal part
        
        //double xprime = x;
        //int yprime = (int)y;
        
        //System.out.println("x is equal to " + x);
        //System.out.println("xprime is equal to " + xprime);
        //System.out.println("y is equal to " + y);
        //System.out.println("yprime is equal to " + yprime);
        
        
        //nested for loops:
        // five stars:
        //     for (int i = 1; i <= 5; i++ )
        //      {
        //        System.out.println("*");
        //      }
        
        
        //five by five stars:
        
        //  for (int i = 1; i <= 5; i++ )
        //  {
        //     for (int j = 1; j <= 5; j++)
        //     { 
        //         System.out.print("*");
        //     }
        //     // must finish loop above before moving on
        //     System.out.println("*");
        //  }
        
        
        // 2.     ....5
        //       ...44
        //       etc
        
       
             
        for ( int i = 1; i <= 5; i++)
        { 
           for ( int j = 4; j >= 1; j--)
           {
               System.out.print(".");
           }
           
           for ( int k = 1; k <= 5; k++)
           {
               System.out.print(k);
           }
         System.out.println();
        }
    }      
}
         
      
    

      