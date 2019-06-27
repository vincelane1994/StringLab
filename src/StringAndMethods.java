import java.util.Scanner;

public class StringAndMethods {

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
		
		word = capitalize(word);
		System.out.println(word);
		
		//wheresWaldo
		System.out.print("Enter a phrase with waldo: ");
		phrase = scnr.nextLine();
		
		System.out.println(wheresWaldo(phrase));
		
		//firstThignsFirst
		System.out.print("Enter a few words to be put in alphabetical order: ");
		String alphOrder1 = scnr.nextLine();
		//String alphorder2 = scnr.next();
		alphOrder1 = firstThingsFirst(alphOrder1);
		System.out.println(alphOrder1);
		
		//reverse
		System.out.print("Enter a word to print it in reverse: ");
		backwards = scnr.next();
		
		System.out.println(reverse(backwards));
		*/
		//afterMath
		System.out.println("afterMath");
		System.out.print("Enter a phrase to display everything after Mathmatics: ");
		mathPhrase = scnr.nextLine();
		mathPhrase = afterMath(mathPhrase);
		
		System.out.println(mathPhrase);

		// Letterize
		System.out.println("Letterize");
		System.out.print("Enter a word: ");
		String letterize = scnr.next();
		
		letterize(letterize);
		
		//soLong
		System.out.print("Enter a pair of words to see which is longer: ");
		String firstWord = scnr.next();
		String secondWord = scnr.next();
		String longerWord = soLong(firstWord, secondWord);
		
		System.out.println(longerWord);
		
		
	}
	
	public static String capitalize(String newString) {

		String firstLetter;
		String rest;
		
		newString = newString.toLowerCase();
		firstLetter = newString.substring(0, 1).toUpperCase();
		rest = newString.substring(1).toLowerCase();
		newString = firstLetter + rest;
		return newString;
	}
	
	public static String wheresWaldo(String userInput) {
		
		userInput = userInput.toLowerCase();
		int ans = userInput.indexOf("waldo");
		userInput = String.format ("%d", ans);
		
		//System.out.println(userInput);
		return userInput;
	}
	
	public static String firstThingsFirst(String phrase) {
		
		int i = phrase.indexOf(' ');
		String firstWord = phrase.substring(0, i);
		String secondWord = phrase.substring(i);
		
		char firstLetter = firstWord.charAt(0);
		secondWord = secondWord.substring(1, secondWord.length());
		char secondLetter = secondWord.charAt(0);
		firstLetter = Character.toLowerCase(firstLetter);
		secondLetter = Character.toLowerCase(secondLetter);
		
		if(firstLetter < secondLetter) {
			phrase = firstWord + " " + secondWord;
		}
		else {
			phrase = secondWord + " " + firstWord;
		}
		
		return phrase;
		
	}
	public static String reverse(String userInput) {
		
		int i = userInput.length();
		String newString = "";
		
		while( i > 0) {
			
			newString = newString + (userInput.substring(i -1, i));
			i = i - 1;
		}
		
		return newString;
		
	}
	public static String soLong(String string1,String string2) {
		String longerString = "";
		
		
		if ( string1.length() < string2.length() ) {
			longerString = string2;
		}
		else if( string2.length() < string1.length()) {
			longerString = string1;
		}
		else if(string1.length() == string2.length()) {
			longerString = string1 + " " + string2;
		}
		return longerString;
	}
	
	public static String afterMath(String mathPhrase) {
		mathPhrase = mathPhrase.toLowerCase();
		
		if( mathPhrase.indexOf("math") != -1) {
			int mathLoc = mathPhrase.indexOf("math");
			mathPhrase = mathPhrase.substring(mathLoc);
		}
		else {
			mathPhrase = "Dud";
		}
		return mathPhrase;
	}
	
	public static void letterize(String word2) {
		int i = 0;
		
		while(i < word2.length()){
			char letter = word2.charAt(i);
			System.out.println(letter);
			i++;
		}
	}
}
