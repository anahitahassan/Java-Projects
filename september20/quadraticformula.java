import java.util.*; // needed for the Math.sqrt function

public class quadraticformula
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your 1st number.");
        int a = input.nextInt();
        
        System.out.println("Please enter your 2nd number.");
        int b = input.nextInt();
        
        System.out.println("Please enter your 3rd number.");
        int c = input.nextInt();
        
        System.out.println((-b + (Math.sqrt((b*b)-4*a*c)))/2*a);
        System.out.println((-b - (Math.sqrt((b*b)-4*a*c)))/2*a);
        
        input.close();
    }
}
