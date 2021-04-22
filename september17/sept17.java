import java.util.*;

public class sept17
{
  public static void main(String[] args)
  {
   
    Scanner project = new Scanner(System.in);
    System.out.println("Please enter a number.");
    
    int i;
    int j = 1;
    int a = project.nextInt(); 
    for (i = a; i > 1; i--) {
      j = j * i;
    }
     
    System.out.println(j);
  }
 
}