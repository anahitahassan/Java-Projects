public class anotherMethodEx
{
    public static void main(String[] args)
    {
        int i = 2;
        doThis(i);
        System.out.println(i);
        
    }

    // here, it says void after public static, meaning nothing is returned. 
    public static void doThis(int i)
    {
        i = 3;
    }
}

