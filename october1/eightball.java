public class eightball
{
    public static void main(String[] args)
    {
        double x = Math.random();
        if ( (100*x) < 5 ){
          System.out.println("It is certain.");  
        } else if ( (100*x) < 10 ){
          System.out.println("It is decidedly so.");  
        } else if ( (100*x) < 15 ){
          System.out.println("Without a doubt.");  
        } else if ( (100*x) < 20 ){
          System.out.println("Yes - definitely.");  
        } else if ( (100*x) < 25 ){
          System.out.println("You may rely on it.");  
        } else if ( (100*x) < 30 ){
          System.out.println("As I see it, yes.");  
        } else if ( (100*x) < 35 ){
          System.out.println("Most likely.");  
        } else if ( (100*x) < 40 ){
          System.out.println("Outlook good.");  
        } else if ( (100*x) < 45 ){
          System.out.println("Yes.");  
        } else if ( (100*x) < 50 ){
          System.out.println("Reply hazy, try again.");  
        } else if ( (100*x) < 55 ){
          System.out.println("Ask again later.");  
        } else if ( (100*x) < 60 ){
          System.out.println("Better not tell you now.");  
        } else if ( (100*x) < 65 ){
          System.out.println("Cannot predict now.");  
        } else if ( (100*x) < 70 ){
          System.out.println("Concentrate and ask again.");  
        } else if ( (100*x) < 75 ){
          System.out.println("Don't count on it.");  
        } else if ( (100*x) < 80 ){
          System.out.println("My reply is no.");  
        } else if ( (100*x) < 85 ){
          System.out.println("My sources say no.");  
        } else if ( (100*x) < 90 ){
          System.out.println("Outlook not so good.");  
        } else if ( (100*x) < 95 ){
          System.out.println("Very doubtful."); 
        } else if ( (100*x) < 100 ){
          System.out.println("Signs point to yes."); 
        }
    }
}     