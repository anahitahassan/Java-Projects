import java.util.*;

public class scannerPractice
{
    public static void main(String[] args)
    {
        Scanner sauce = new Scanner(System.in); 
        
        System.out.print("Enter a number.");
        String numberOne = sauce.nextLine();
        
        System.out.print("Enter another number.");
        String numberTwo = sauce.nextLine();
        
        System.out.print("Enter an operation: +, -, *, /");
        String operation = sauce.nextLine();
        
        sauce.close();
        
        System.out.print(numberOne + operation + numberTwo);
        // If you entered 3 and 4 and *, the result printed is: 3*4, not 12. 
    }
}
