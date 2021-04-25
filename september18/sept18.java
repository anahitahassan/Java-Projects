import java.util.*;

public class sept18 
{
    public static void main(String[] args)
    {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an upper bound: ");

        int i;
        int j = 1;
        int v = input.nextInt();
        input.close();

        for (i = v; i > 1; i++) 
        {
            j = 3 * i;
        }
        
        System.out.println(j);*/

        // i is set equal to the input from the user, and as long as i remains larger than 1, 
        // j, which is initally 1, will be multiplied by 3
        // this will happen an infinite number of times because i is incremented
        // a super large number is returned 

        /*
        Scanner project = new Scanner(System.in);
        System.out.println("Please enter another upper bound.");

        int w = project.nextInt();
        project.close();

        for (int a = 1; a <= w/3 ; a++) 
        {
            System.out.println(a * 3);
        }*/

        // here, a = 1, w is user input. 
        // as long as a is less than or equal to w/3, a gets multiplied by 3. 
        // let w by 5. 
        // a = 1 is <= 5/3 = 1
        // a*3 = 3 is printed (no changes to w)
        // now a = 2, which is not <= 5/3 = 1. nothing else is printed. 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 3rd upper bound.");

        int z = scanner.nextInt();
        scanner.close();

        for (int b = 1; b <= z/3 ; b++) 
        {
            System.out.println(b * 3);
            z *= 3;
        }

        // this is same as above except with each iteration z is multiplied by 3. 
        // let z = 5, b = 1 <= 5/3 = 1
        // b is now 3, z is now 15
        // second iteration: b = 2 <= 15/3 = 5
        // b is now 6, z is now 45
        // this will continue forever
        // stuff that is printed: 3, 6, etc...
    }
}
