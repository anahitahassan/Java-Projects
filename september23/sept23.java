import java.util.*;

public class sept23
{
    public static void main (String [] args)
    {
        //1. what does following quote print
        int i = 5;
        while (i == 0)
        {
            System.out.println(i);
            i++;
        }
        
        //prints: 5
        //4
        //3
        //2
        //1
    
        //2. whats wrong with the code
        int a = 5; 
        while (a >= 0)
        {
            System.out.println(a);
            a = (3 * a + 25)/2;
        }

        //prints i=5, i=20, i=42, keeps goin forever -- infinite loop

        //initialize and assign 3 to int variable and change the value
        int x =3;
        x = 5;
            
        int x = 1-;
        int y = x/3;
        x = x % 4; 
        x++;
        // ans: 10 -->2 -->3
        
        //9. whats wrong iwth this code
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = input.nextInt();
        etc. 
            // theres no input.nextLine
            
            //grading program
            
            //ask user for double, truncate number cut off digits
            //4.23 --> 4
            
            x = 4.23
            double counter = 0
            while ( x > 1)
        {
            x--:
            counter++;
        }
        

    }
}