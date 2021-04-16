import java.util.*;

public class madlibs
{
    public static void main(String[] args)
    {
        Scanner Uggs = new Scanner(System.in); 
        
        System.out.print("1. Enter an adjective to describe a food.");
        String adjective = Uggs.nextLine();
        
        System.out.print("2. Enter a main dish.");
        String mainfood = Uggs.nextLine();
        
        System.out.print("3. Enter a number greater than 50.");
        int number = Uggs.nextInt();
        Uggs.nextLine();
        
        System.out.print(" Enter a baking ingredient");
        String bakingitem = Uggs.nextLine();
        
        System.out.print(" Enter your favorite food");
        String favfood = Uggs.nextLine();
        
        System.out.print(" Enter your least favorite food");
        String leastfavfood = Uggs.nextLine();
        
        System.out.print(" Enter an adverb");
        String firstadverb = Uggs.nextLine();
        
        System.out.print(" Enter an adverb");
        String secondadverb = Uggs.nextLine();
        
        System.out.print(" Enter a gross food");
        String firstgrossfood = Uggs.nextLine();  
                        
        System.out.print(" Enter another gross food");
        String secondgrossfood = Uggs.nextLine();  
                        
        System.out.print(" Enter a number over 1000");
        String thousandnumber = Uggs.nextLine();
        
        System.out.print(" Enter a disgusting food");
        String disgustingfood = Uggs.nextLine();
        
        System.out.print(" Enter an object that would belong in a kitchen");
        String noun = Uggs.nextLine();
        
        System.out.print(" Enter an adjective to describe a sound");
        String soundadj = Uggs.nextLine();
        
        System.out.print(" Enter a room in a house");
        String room = Uggs.nextLine();
        
        System.out.print(" Enter a adjective to describe height/size");
        String heightadj = Uggs.nextLine();
        
        System.out.print(" Enter a place");
        String place = Uggs.nextLine();
        
        System.out.print(" Enter an adverb");
        String thirdadverb = Uggs.nextLine();
        
        System.out.print(" Enter an adjective");
        String alienadj = Uggs.nextLine(); 
        
        System.out.print(" Enter an adverb");
        String fourthadverb = Uggs.nextLine();
        
        System.out.print(" Enter an adverb");
        String fifthadverb = Uggs.nextLine();
        
        System.out.print(" Today I made " + adjective + " " + mainfood + ".");
        System.out.print(" I first put " + number + " cups of " + bakingitem + " in a bowl.");
        System.out.print(" Next, I mixed a cup of " + favfood + " with a cup of " + leastfavfood + ".");
        System.out.print(" I " + firstadverb + " stirred all those ingredients together.");
        System.out.print(" Oh no! I just realized I put in too much " + bakingitem + "!");
        System.out.print(" I was only supposed the put in 5 cups of " + bakingitem + " instead of " + number);
        System.out.print(" , which is ");
        System.out.print( number - 5 + " cups too much!" );
        System.out.print(" Though I was dissapointed I messed up the recipe, I decided to continue.");  
        System.out.print(" I added a few more ingredients such as " + firstgrossfood + " and " + secondgrossfood + ".");
        System.out.print(" Then, I preheated the oven to " + thousandnumber + " degrees farenheit.");
        System.out.print(" Suddenly Gordon Ramsay slammed down my door and sprinted to the kitchen. \"You're doing this all wrong!\", he yelled. ");
        System.out.print(" You forgot to add the " + disgustingfood + "!");
        System.out.print(" As I shuffle around to find it, my " + noun + " suddenly catches on fire.");
        System.out.print(" The fire consumes the entire house and we barely escape with our lives." );
        System.out.print(" The only thing I was able to save was the " + mainfood + ", now completely burnt.");
        System.out.print(" Suddenly we hear a " + soundadj + " sound coming from the sky.");
        System.out.print(" A helicopter lands on the remains of what was my " + room + ".");     
        System.out.print(" Two " + heightadj + " figures step out of the helicopter. It's Jojo Siwa and Peppa pig! ");
        System.out.print(" \"Peppa... what are you doing in my " + room + "?\", I say.");
        System.out.print(" \"We're here to save you!\" Jojo Siwa yells.");
        System.out.print(" They take us aboard the helicopter and we fly to " + place + ".");
        System.out.print(" Suddenly, the helicopter runs out of fuel and we crash. ");
        System.out.print(" Peppa pig, Jojo Siwa, Gordon Ramsay and I all survive, but we realize we aren't at " + place + ".");
        System.out.print(" We crashed our helicopter at Area 51! ");
        System.out.print(" Suddenly, the U.S. Armed Forces charge toward us and " + thirdadverb + " tell us to surrender over loud speakers and the sound of sirens. ");
        System.out.print(" We have mere minutes left to decide what to do before they arrest us. ");
        System.out.print(" The 4 of us helplessly sat there, on the rocky, dry terrain of Area 51, until a small object in the sky swoops down towards the ground. ");
        System.out.print(" \"It's the aliens!\", Peppa exclaims. ");
        System.out.print(" A group of " + alienadj + " aliens step out of their spaceship and claim they can help us escape, but we must give them something in return."); 
        System.out.print(" I remember I still have my burnt " + mainfood + ".");
        System.out.print(" I " + fourthadverb + " present it to the alien leader and he " + fifthadverb + " eats it. ");
        System.out.print(" \"Wow, it's so " + adjective + "!\", the alien says. ");
        System.out.print(" The aliens take us aboard their space ship and, together, we barely escape the U.S. armed forces. ");
        System.out.print(" On the spaceship, the aliens, Gordon Ramsay, Peppa Pig, Jojo Siwa, and I all have a pizza party as we head towards the M-87 black hole. ");
        System.out.print(" So this is how I made " + mainfood + "!");                 
    }
}