/** 
 * 2 person Tic Tac Toe game. 
 * It prints out a graphical output of the board after each turn.
 * this version of the tictactoe games uses char variables and do function
 */
import java.util.*;

public class FINALTICTACTOE 
{
    public static void main( String[] args )
    {
        char player; // player = 'X' or 'O'
        char location; // location = a, b, c, d, e, f, g, h or i
        int turn = 1; // turns of the game (9)
        boolean error = false;
        boolean gameOver = false;
        
        // create variables and initialize 9 locations of the board
        char a = 'a';
        char b = 'b';
        char c = 'c';
        char d = 'd';
        char e = 'e';
        char f = 'f';
        char g = 'g';
        char h = 'h';
        char i = 'i';
        
        System.out.println("Let's play Tic-Tac-Toe!");
        // print ut the game board for the first time
        gameOver = counter(a, b, c, d, e, f, g, h, i);
        
        // create scanner object to take the input from keyboard
        Scanner scanner = new Scanner(System.in);
        
        do
        {
            // find out which player it is: 'X' or 'O'
            // game started with 'X', turn = 1. So player X gets every odd turn
            if(turn % 2 == 0)
            {
                player = 'O';
            }
            else
            {
                player = 'X';
            }
            // prompt player for the location a, b, c, d, e, f, g, h or i
            System.out.println("Player (" + player + "): enter the designated letter for the location on the board");
            
            // take the player input as location of the board
            location = scanner.next().charAt(0);
            
            if (location == 'a')
            {
                // check if the location is already taken
                if (a != 'a')
                {
                    System.out.println("Location " + location + " is already taken!");
                    error = true;
                }
                else // location 'a' can be taken by the player
                {
                    a = player;
                    error = false;
                }      
            }
            else if (location == 'b')
            {
                // check if the location is already taken
                if (b != 'b')
                {
                    System.out.println("Location " + location + " is already taken!");
                    error = true;
                }
                else
                {
                    b = player;
                    error = false;
                }   
            }
            else if (location == 'c')
            {
                // check if the location is already taken
                if (c != 'c')
                {
                    System.out.println("Location " + location + " is already taken!");
                    error = true;
                }
                else
                {
                    c = player;
                    error = false;
                }    
            }
            else if (location == 'd')
            {
                // check if the location is already taken
                if (d != 'd')
                {
                    System.out.println("Location " + location + " is already taken!");
                    error = true;
                }
                else
                {
                    d = player;
                    error = false;
                } 
            }
            else if (location == 'e')
            {
                // check if the location is already taken
                if (e != 'e')
                {
                    System.out.println("Location " + location + " is already taken!");
                    error = true;
                }
                else
                {
                    e = player; 
                    error = false; 
                }   
            }
            else if (location == 'f')
            {
                // check if the location is already taken
                if (f != 'f')
                {
                    System.out.println("Location " + location + " is already taken!");
                    error = true;
                }
                else
                {
                    f = player;
                    error = false;
                }    
            }
            else if (location == 'g')
            {
                // check if the location is already taken
                if (g != 'g')
                {        
                    System.out.println("Location " + location + " is already taken!");
                    error = true;
                }
                else
                {
                    g = player;
                    error = false;
                }   
            }
            else if (location == 'h')
            {
                // check if the location is already taken
                if (h != 'h')
                {
                    error = true;
                    System.out.println("Location " + location + " is already taken!"); 
                }
                else
                {
                    h = player;
                    error = false;
                } 
            }
            else if ( location == 'i')
            {
                // check if the location is already taken
                if (i != 'i')
                {
                    error = true;
                    System.out.println("Location " + location + " is already taken!"); 
                }
                else
                {
                    i = player;
                    error = false;
                } 
            }
            else
            {
                error = true;
                System.out.println("Wrong location chosen!");        
            }
            
            // if there is no error, print out the board with player's move
            if( error == false)
            {       
                gameOver = counter(a, b, c, d, e, f, g, h, i);
                
                if (gameOver == true)
                {
                    break;
                }
                // next turn
                turn++;
            }
            
        } while( turn < 10 );
        
        // game over, let the players know
        System.out.println("Game Over!");
        // close the scanner
        scanner.close();
    }
    
    public static boolean counter (char a, char b, char c, char d, char e, char f, char g, char h, char i)
    {
        boolean gameOver = false;
        char winner = ' ';
        
        // Check if any player won already
        // rows match 
        if (a == b && b == c)
        {
            winner = b;
        }        
        if (d == e && e == f)
        {
            winner = e;
        }        
        if (g == h && h == i)
        {
            winner = h;
        }
        
        // columns match
        if (a == d && d == g)
        {
            winner = d;
        }
        if (b == e && e == h)
        {
            winner = e;
        }        
        if (c == f && f == i)
        {
            winner = f;
        }
        
        // diagonals match
        if ( a == e && e == i ) 
        {
            winner = e;
        } 
        if ( c == e && e == g )
        {
            winner = e;
        }
        
        // prints out the game board at each turn
        System.out.println( "---|---|---");
        System.out.println( " " + a + " | " + b + " | " + c );
        System.out.println( "---|---|---");       
        System.out.println( " " + d + " | " + e + " | " + f );        
        System.out.println( "---|---|---");      
        System.out.println( " " + g + " | " + h + " | " + i );
        System.out.println( "---|---|---");
        
        // Print the message if game is over
        if (winner != ' ')
        {
            System.out.println("Winner is Player (" + winner + ")!");
            gameOver = true;
        }
        return gameOver;
    }
}