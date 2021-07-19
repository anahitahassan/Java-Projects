// import java.util.*;
// What is the import java.util used for?
// The import is a java keyword which is used for importing a Java class or entire Java package.
// It is not at all essential to use the line unless you are trying to access something that is present in the “util“ package.
// Also, for later: import java.util.Scanner 
	// Scanner sc = new Scanner(System.in); 
	// int x = sc.nextInt(); 

	
public class helloworldper1
{
	public static void main(String[] args)
	{
		System.out.println("Hello world!");

		// Note: many lines are commented out because of the yellow squiggle VSCode puts under lines where
		// variables, etc aren't being used. 

		// Variables without values:
			// int a; 
			// double b; 
		// Variables created w/ values: 
			// int c = 7; 
			// double GPA = 4.0;
			// String subject = "AP English";
			// boolean isCorrect = true;

		// What happens when we declare a variable and then change it? 
		int d = 7; 
		System.out.println(d); // Prints 7
		d = 11;
		System.out.println(d); // Prints 11 

		// Order of Operations
		d = 8 + 9 / 3 - 4;
		// = 8 + (3) - 4 = 7
		System.out.println(d); // Prints 7
		
		int e = 6;
		d = d + e;
		System.out.println(d); // Prints 13 now

		// Dividing whole numbers 

		int f = 9;
		f = f / 2;
		System.out.println(f); // Prints 4. 
		// Anytime there is a decimal, it will round DOWN

		double g = 9; 
		g = g / 2;
		System.out.println(g); // Prints 4.5
		// int --> rounds down decimal
		// double --> keeps decimal

		int h = 8; 
		System.out.println("Hello world " + h);
		// Prints "Hello world 8"

		String name = "Anahita";
		System.out.println("Hello my name is " + name);
		// Prints "Hello my name is Anahita"

		// Relationship rule
		// The age of the younger person should not be less than half the age of the older person plus seven years.

		// Younger person: 18
		int youngerPerson = 18;
		// Older person: ? 
		int olderPerson = youngerPerson * 2 - 7;
		System.out.println(olderPerson); // Prints 29
		// So when the younger is 18, their partner shouldn't be older than 29. 
		
		// Now say the older person is 50. 
		olderPerson = 50;
		youngerPerson = olderPerson / 2 + 7; 
		System.out.println(youngerPerson); // Prints 32
		// So when the older is 50, their partner shouldn't be younger than 32. 

	}
}













