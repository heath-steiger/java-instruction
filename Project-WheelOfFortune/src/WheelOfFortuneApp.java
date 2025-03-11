import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import util.MyConsole;

public class WheelOfFortuneApp {
	public static List<String> phrases = new ArrayList<>();
	private static List<String> Vowels= new ArrayList<>(Arrays.asList("a", "e","i","o","u"));
	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Wheel of Fortune");
		phrases.add("butter my buns");
		phrases.add("sting like a bee");
		phrases.add("early bird gets the worm");
		String phrase = getRandomPhrase();
		MyConsole.printLine("\t"+phrase);
		String hiddenPhrase = "_".repeat(phrase.length());
		String command = "";
		while (hiddenPhrase.indexOf('_') >= 0) {
			displayHiddenPhrase(phrase, hiddenPhrase);
			MyConsole.printLine("Buy vowel");
			System.out.println("Guess constonant");
			System.out.println("Solve");
			command = MyConsole.promptString("Command: ");

			switch (command) {
			case "Buy a vowel":
				
					String guess = MyConsole.promptString("Letter guess: ",Vowels);
					char[] chars = phrase.toCharArray();
					char[] hiddenChars = hiddenPhrase.toCharArray();
					if (phrase.indexOf(guess.charAt(0)) == -1) {
						MyConsole.printLine("Incorrect guess");
					} else {
						for (int i = 0; i < chars.length; i++) {
							if (guess.charAt(0) == chars[i]) {
								hiddenChars[i] = guess.charAt(0);
							}
						}
						hiddenPhrase = String.valueOf(hiddenChars);
					}
				
				break;
			case "Guess a constonant":
					guess = MyConsole.promptString("Letter guess: ");
					chars = phrase.toCharArray();
					hiddenChars = hiddenPhrase.toCharArray();
					if (phrase.indexOf(guess.charAt(0)) == -1) {
						MyConsole.printLine("Incorrect guess");
					} else {
						for (int i = 0; i < chars.length; i++) {
							if (guess.charAt(0) == chars[i]) {
								hiddenChars[i] = guess.charAt(0);
							}
						}
						hiddenPhrase = String.valueOf(hiddenChars);
					}
				
				break;
			case "Solve the Phrase":
				guess = MyConsole.promptString("Phrase: ");
				chars = phrase.toCharArray();
				hiddenChars = hiddenPhrase.toCharArray();
				if (phrase.indexOf(guess.charAt(i)) == -1) {
					MyConsole.printLine("Incorrect guess");
				} else {
					for (int i = 0; i < chars.length; i++) {
						if (guess. == chars[i]) {
							hiddenChars[i] = guess.charAt(0);
						}
					}
					hiddenPhrase = String.valueOf(hiddenChars);
				}
//				if (guess == phrase) {
//					MyConsole.printLine("Guess was correct!");
//				}else {MyConsole.printLine("Guess was incorrect.");}
//				
			default:
				MyConsole.printLine("Invalid command.");
				break;
			}
		}
		// phrase storing/ selection
		// player bank
		// rounds
		// buying vowel

		MyConsole.promptString("Bye");
	}

	private static void displayHiddenPhrase(String phrase, String hiddenPhrase) {
		// display hiddenWord with spaces

		String hiddenPhraseDisplay = "";
		char[] chars = hiddenPhrase.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (phrase.charAt(i) == ' ') {
				hiddenPhraseDisplay += chars[i] + " | ";
			} else {
				hiddenPhraseDisplay += hiddenPhrase.charAt(i) + " ";
			}
		}
		MyConsole.printLine(hiddenPhraseDisplay);

	}

	public static String getRandomPhrase() {

		Random rand = new Random();
		int phrase = rand.nextInt(phrases.size());
		return phrases.get(phrase);
	}
}
