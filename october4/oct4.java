public class oct4
{
    public static void main(String[] args)
    {
        int a = 6;
        int b = 9;
        int i = 2; 
        
        if ( a / b == 1 ) 
        {
            System.out.println("1"); 
        }    
        if (a % i == 0 && b % i == 0)
        {
            System.out.println((a/i)/(b/i)); 
        } 
        i++;

        // (3)/(5) will print to 0 since they round down
        // we are tyring to divide a by b and print it as a decimal. 
        // when you simply divide a by b (and they are ints) it will round. 
        // yeah i'm still not sure what i'm supposed to do in this file so i'm moving on
    }
}