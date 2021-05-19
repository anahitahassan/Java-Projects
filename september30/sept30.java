public class sept30
{
    public static void main(String[] args)
    { 
        int x = 3;
        int y = 9;
        int z = add(x,y);
        System.out.println(z); // since vars representing 3 and 9 are passed, 12 is printed. 

        System.out.println(add(100,100));
    }

    public static int add(int a, int b)
    {
        int answer = a + b;
        return answer;
        
    }
    
}