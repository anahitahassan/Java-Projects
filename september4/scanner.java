import java.util.*;
// Since we used scanner, the yellow squiggle (indicating something isn't being used) is gone since we use scanner here.

public class scanner
{
  public static void main(String[] args)
  {
    String x;
    Double y;
    
    Scanner Uggs = new Scanner(System.in);
    
    // use Uggs for inputs
    x = Uggs.nextLine(); 
    y = Uggs.nextDouble();
    
    Uggs.close();

    // unless you use Uggs.nextLine, must put always Uggs.nextLine(); 
    
    // nextInt lets you input a integer
    // nextDouble lets you input a double
    // next word imput word
    // nextLine for word/phrase 
    
    System.out.println("This is a string: " + x);
    System.out.println("This is a double: " + y);
    
  }
 
}