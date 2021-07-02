// I won't end up using this board since I need to be able to change vars in another method

import java.util.*;

public class tttboard
{
    public static void main(String[] args)
    { 
        System.out.println("Let's play tic-tac-toe!");
        counter();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 (X): enter the designated letter for the location on the board");
        
        counter(); 
        scanner.close();
    }
    
    public static void counter()
    {
       System.out.println(" a | b | c "); 
       System.out.println("---|---|---"); 
       System.out.println(" d | e | f "); 
       System.out.println("---|---|---"); 
       System.out.println(" g | h | i "); 
    }
}
