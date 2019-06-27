import java.util.Scanner;

public class StringLab {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String word;
		String phrase;
		String backwards;
		String mathPhrase;
		/*
		//Capitalize
		System.out.print("Enter a word to capitalize: ");
		word = scnr.nextLine();
		
		word = StringMethods.capitalize(word);
		System.out.println(word);
		
		//wheresWaldo
		System.out.print("Enter a phrase with waldo: ");
		phrase = scnr.nextLine();
		
		System.out.println(StringMethods.wheresWaldo(phrase));
		
		//firstThignsFirst
		System.out.print("Enter a few words to be put in alphabetical order: ");
		String alphOrder1 = scnr.nextLine();
		//String alphorder2 = scnr.next();
		alphOrder1 = StringMethods.firstThingsFirst(alphOrder1);
		System.out.println(alphOrder1);
		
		//reverse
		System.out.print("Enter a word to print it in reverse: ");
		backwards = scnr.next();
		
		System.out.println(StringMethods.reverse(backwards));
		*/
		//afterMath
		System.out.print("Enter a phrase to display everything after Mathmatics: ");
		mathPhrase = scnr.nextLine();
		mathPhrase = StringMethods.afterMath(mathPhrase);
		
		System.out.println(mathPhrase);

		//Letterize
		System.out.println("Letterize");
		System.out.print("Enter a word: ");
		String letterize = scnr.next();
		
		StringMethods.letterize(letterize);
		
		//camelCase
		System.out.print("Enter a phrase: ");
		String newPhrase = scnr.nextLine();
		System.out.println(StringMethods.camelCase(newPhrase));
		
		//soLong
		System.out.print("Enter a pair of words to see which is longer: ");
		String firstWord = scnr.next();
		String secondWord = scnr.next();
		String longerWord = StringMethods.soLong(firstWord, secondWord);
		
		System.out.println(longerWord);
		
		
		
		
		}
	
}
