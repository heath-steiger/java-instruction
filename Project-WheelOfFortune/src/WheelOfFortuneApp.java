import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import util.MyConsole;

public class WheelOfFortuneApp {
	public static List<String> phrases = new ArrayList<>();

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Wheel of Fortune");		
		phrases.add("butter my buns");
		phrases.add("sting like a bee");
		phrases.add("early bird gets the worm");
		String phrase = getRandomPhrase();
		MyConsole.printLine(phrase);
		String hiddenPhrase = "_".repeat(phrase.length());
		MyConsole.printLine(hiddenPhrase);
		displayHiddenPhrase(hiddenPhrase);
		// phrase storing/ selection
		// player bank
		// rounds
		// buying vowels
		int firstSpaceIdx = phrase.indexOf(' ');
		MyConsole.printLine("firstspace = " + firstSpaceIdx);
		int secondSpaceIdx = phrase.indexOf(' ', firstSpaceIdx + 1);
		MyConsole.printLine("secondspace = " + secondSpaceIdx);
		int thirdSpaceIdx = phrase.indexOf(' ', secondSpaceIdx + 1);
		MyConsole.printLine("thirdspace = " + thirdSpaceIdx);
		String firstWord = phrase.substring(0, firstSpaceIdx);
		MyConsole.printLine(firstWord);
		String secondWord = phrase.substring(firstSpaceIdx + 1, secondSpaceIdx);
		MyConsole.printLine(secondWord);
		try {
		    String thirdWord = phrase.substring(secondSpaceIdx + 1, thirdSpaceIdx);
		    MyConsole.printLine(thirdWord);
		} catch (StringIndexOutOfBoundsException e) { 
		    String thirdWord = phrase.substring(thirdSpaceIdx + 1);
		    MyConsole.printLine(thirdWord);
		}
		
		MyConsole.promptString("Bye");
	}
	private static void displayHiddenPhrase(String hiddenPhrase) {
		// display hiddenWord with spaces
		String hiddenPhraseDisplay = "";
		char[] chars = hiddenPhrase.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			hiddenPhraseDisplay += chars[i] + " ";
		}
		MyConsole.printLine(hiddenPhraseDisplay);
	}

	public static String getRandomPhrase()
	{

	    Random rand = new Random();
	    int phrase = rand.nextInt(phrases.size());
	    return phrases.get(phrase);
	}
}
