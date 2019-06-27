
public class StringMethods {
	
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
		//System.out.println("");
	}
	
	public static String camelCase(String word2) {
		int i = 0;
		
		String firstLetter;
		String rest;
		String secondWord = "";
		
		word2 = word2.toLowerCase();
		firstLetter = word2.substring(i, i + 1).toUpperCase();
		rest = word2.substring(i + 1).toLowerCase();
		word2 = firstLetter + rest;
		//System.out.println(word2);
		i = word2.indexOf(' ');
		//System.out.println(i);
		
		while(i > 0) {
			
			firstLetter = word2.substring(i+1, i+2).toUpperCase();
			rest = word2.substring(i+2);
			secondWord = firstLetter + rest;
			word2 = word2.substring(0, i) + secondWord;
			
			i= word2.indexOf(' ');
			//i = -1;
		}
		return word2;
	}
}
