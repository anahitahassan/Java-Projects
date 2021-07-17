import java.util.*;

public class oct12 {

    public static void main(String[] args){

        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int n2 = scanner.nextInt();
       
        while (n1 != 0 && n2 != 0){
            if(n1 > n2)
            n1 = n1 % n2;
            else
            n2 = n2 % n1;
        }
       
        scanner.close();
        System.out.print(n2/n1);
    }  
}