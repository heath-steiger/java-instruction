import util.MyConsole;

public class StringsApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Strings!");

		// p. 469 index, length, charAt
		String fullName = MyConsole.promptString("Enter fullname: ");
		// first, middle. last name?
		int firstSpaceIdx = fullName.indexOf(' ');
		MyConsole.printLine("firstspace = " + firstSpaceIdx);
		int secondSpaceIdx = fullName.indexOf(' ', firstSpaceIdx + 1);
		MyConsole.printLine("secondspace = " + secondSpaceIdx);

		// p. 471
		String firstName = fullName.substring(0, firstSpaceIdx);
		MyConsole.printLine(firstName);
		String middleName = fullName.substring(firstSpaceIdx + 1, secondSpaceIdx);
		MyConsole.printLine(middleName);
		String lastName = fullName.substring(secondSpaceIdx + 1);
		MyConsole.printLine(lastName);

		// HangMan hint -hidden word
		String theWord = "happyhour";
		String hiddenWord = "_".repeat(theWord.length());
		MyConsole.printLine("The word = " + theWord + ".");
		MyConsole.printLine("Hidden word = " + hiddenWord + ".");

		MyConsole.printHeader("Resolve letters!");
		// loop till all letters guessed
		while (hiddenWord.indexOf('_') >= 0) {
			displayHiddenWord(hiddenWord);
			// guess a letter
			String guess = MyConsole.promptString("Letter guess: ");
			// resolve letter in hiddenWord or display message incorrectGuess
			char[] chars = theWord.toCharArray();
			char[] hiddenChars = hiddenWord.toCharArray();
			if (theWord.indexOf(guess.charAt(0)) == -1) {
				MyConsole.printLine("Incorrect guess");
			} else {
				for (int i = 0; i < chars.length; i++) {
					if (guess.charAt(0) == chars[i]) {
						hiddenChars[i] = guess.charAt(0);
					}
				}
				hiddenWord = String.valueOf(hiddenChars);
			}
		}

		MyConsole.printLine("Goodbye!");

	}

	private static void displayHiddenWord(String hiddenWord) {
		// display hiddenWord with spaces
		String hiddenWordDisplay = "";
		char[] chars = hiddenWord.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			hiddenWordDisplay += chars[i] + " ";
		}
		MyConsole.printLine("Hidden word display = " + hiddenWordDisplay + ".");
	}

}
