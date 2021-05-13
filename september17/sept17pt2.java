import java.util.*;

public class sept17pt2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        
        int a = input.nextInt();
        input.nextLine();
        
        int answer = a;
        a--;
        
        while( a > 0 )
        {
            answer *= a;
            a--;
        }
        
        System.out.println(answer);
        input.close();

        // we copy the input a and set it equal to answer, we then decrease a by one
        // anwer is now multipled by a and that is new value of answer
        // a is decremented again
        // answer is multiplied by a and that is new value of answer
        // this continues as a decriments and until a is 0
        // example, say user input a = 5
        // answer = 5
        // a = 4
        // answer = 5*4 = 20
        // a = 3 
        // answer = 20*3 = 60
        // a = 2
        // answer = 60*2 = 120
        // a = 1
        // answer = 120*1 = 120
        // a = 0 --> while loop stops
        // answer = 120 is printed. 
    }
}
