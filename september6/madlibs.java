import java.util.*;

public class madlibs
{
  public static void main(String[] args)
  {
    int x;
    
    Scanner Uggs = new Scanner(System.in);
    
    System.out.println("please enter your favorite integer");
    x = Uggs.nextInt();
    Uggs.nextLine();
    
    System.out.println("please enter your least favorite integer");
    x = Uggs.nextInt();
    Uggs.nextLine();

    Uggs.close();
    
    System.out.println("your favorite integer is " + x);
    System.out.println("your least favorite integer is " + x);
    
  }
  
}