import java.util.Scanner;

public class StringLab {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String word;
		String phrase;
		String backwards;
		String mathPhrase;
		
		//camelCase
		System.out.println("camelCase");
		System.out.print("Enter a phrase: ");
		String newPhrase = scnr.nextLine();
		//newPhrase = "the rough car";
		//System.out.println(newPhrase);
		System.out.println(StringMethods.camelCase(newPhrase));
		System.out.println("");
		
		//Capitalize
		System.out.println("Capitalize");
		System.out.print("Enter a word to capitalize: ");
		word = scnr.nextLine();
		
		word = StringMethods.capitalize(word);
		System.out.println(word);
		System.out.println("");
		
		//wheresWaldo
		System.out.println("wheresWaldo");
		System.out.print("Enter a phrase with waldo: ");
		phrase = scnr.nextLine();
		
		System.out.println(StringMethods.wheresWaldo(phrase));
		System.out.println("");
		
		//firstThingsFirst
		System.out.println("firstThingsFirst");
		System.out.print("Enter a few words to be put in alphabetical order: ");
		String alphOrder1 = scnr.nextLine();
		//String alphorder2 = scnr.next();
		alphOrder1 = StringMethods.firstThingsFirst(alphOrder1);
		System.out.println(alphOrder1);
		System.out.println("");
		
		//afterMath
		System.out.println("afterMath");
		System.out.print("Enter a phrase to display everything after Mathmatics: ");
		mathPhrase = scnr.nextLine();
		mathPhrase = StringMethods.afterMath(mathPhrase);
		
		System.out.println(mathPhrase);
		System.out.println("");

		//reverse
		System.out.println("reverse");
		System.out.print("Enter a word to print it in reverse: ");
		backwards = scnr.next();
		System.out.println("");
		
		//System.out.println(backwards);
		System.out.println(StringMethods.reverse(backwards));
		System.out.println("");
		
		

		//Letterize
		System.out.println("Letterize");
		System.out.print("Enter a word: ");
		String letterize = scnr.next();
		
		StringMethods.letterize(letterize);
		System.out.println("");
		
		
		//soLong
		System.out.println("soLong");
		System.out.print("Enter a pair of words to see which is longer: ");
		String firstWord = scnr.next();
		String secondWord = scnr.next();
		String longerWord = StringMethods.soLong(firstWord, secondWord);
		
		System.out.println(longerWord);
		
		
		
		
		}
	
}
