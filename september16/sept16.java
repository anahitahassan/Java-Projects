import java.util.*;

public class sept16
{
    public static void main(String[] args)
    {
        Scanner project = new Scanner(System.in);
        System.out.println("Please enter a number.");
    
        int i;
        int j;
        int a = project.nextInt();
        for (i = 1; i <= a; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // how does this program work: 

        // i and j are initilized but not declared until the for loop
        // we take in the number the user inputed (say the user said 4)
        // for the first for loop, the code inside that loop will iterate 1, 2, 3, 4 times and stop at 4 (a)
        // within the first for loop is another for loop that will iterate the code depending on which iteration
        // of the first loop it is on. (sounds complicated but it really isn't)
        
        // let's run through it. say the user said a=4. 

        // i = 1 --> j = 1 --> print * (and since j=1, this only happens once)
        // new line, end of first (/4) iteration of 1st for loop
        // i = 2 --> j = 1 --> print * (and j will be 1, then 2 since i = 2, so ** is printed)
        // new line, end of second (/4) iteration of 1st for loop
        // i = 3 --> j = 1 --> print * (and j will be 1, then 2, then 3 since i = 3, so *** is printed)
        // new line, end of third (/4) iteration of 1st for loop
        // i = 4 --> j = 1 --> print * (and j will be 1, then 2, then 3, then 4 since i = 4, so **** is printed)
        // new line, end of fourth (/4) iteration of 1st for loop, loop is complete. 
    }
}