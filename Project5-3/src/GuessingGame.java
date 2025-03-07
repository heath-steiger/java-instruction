import java.util.Scanner;

public class GuessingGame {
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Welcome to the Guss the Number Game");
			System.out.println("+++++++++++++++++++++++++++++++++++");
			System.out.println("\nI'm thinking of a number from 1 to 100.");
			System.out.println("Try to guess it.");
			  int Randomnbr = (int) (Math.random()*100)+1;
			  int count = 0;
			  int guess = 0;
			  while (guess != Randomnbr) {
			      guess = promptInt("\nEnter Number: ");
			      count++;
			      int diff = guess - Randomnbr;
			      if (diff == 0) {
			    	  System.out.println(displayWinnerMessage(count));
			      }
			      else if (diff < -10) { System.out.println("Way too low! Guess again."); }
			      else if (diff < 0) { System.out.println("Too low! Guess again."); }
			      else if (diff > 10) { System.out.println("Way too high! Guess again."); }
			      else if (diff > 0) { System.out.println("Too high! Guess again."); }
			  }
			
	}
		private static int promptInt(String prompt) {
			boolean isValid = false;
			int result = 0;
			while (!isValid) {
				try {
					System.out.print(prompt);
					result = Integer.parseInt(sc.nextLine());
					
				} catch (Exception e) {
					System.err.println("Error - must be a whole number. Try again.");
				}
				 if (result >= 1 && result <= 100) {
				     isValid = true;
				 }
				 else {
					 System.err.println("Error - entry must be between " + 1 + " and " + 100 + ".");
					}
			}
			return result;
		}
		   public static String displayWinnerMessage(int count)
		   {
		       String msg = ("\nYou got it in " + count + " tries.");
		       if (count <= 3) { msg += ("\nGreat work! You are a mathematical wizard."); }
		       else if (count <= 7) { msg += ("\nNot too bad! You've got some potential."); }
		       else { msg += ("\nWhat took you so long? Maybe you should take some lessons."); }
		       return msg;
		   }
}
