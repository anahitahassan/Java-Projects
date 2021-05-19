public class anotherMethodEx
{
    public static void main(String[] args)
    {
        int i = 2;
        doThis(i); 
        System.out.println(doThis(i)); 
        // so i is changed in the method, and we see that when it is printed out. 
        // even after we call that method, i doesn't change. 

        int a = 700; 
        System.out.println(doThisDifferently(a));  
        
    }

    // here, it says void after public static, meaning nothing is returned. 
    public static void doThis(int j)
    {
        j = 3;
        System.out.println("method:" + j);
    }
    public static int doThisDifferently(int b)
    {
        b = 800;
        return b;
    }


}

