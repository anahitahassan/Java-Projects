/*
import java.util.*;

public class oct12p4 {
  
  
    public static void main(String args[]){
     
        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
      
        System.out.println(findGCD(number1,number2));
      
      
    }

    // Java method to find GCD of two number using Euclid's method
    // @return GDC of two numbers in Java
    
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
  
}
*/
