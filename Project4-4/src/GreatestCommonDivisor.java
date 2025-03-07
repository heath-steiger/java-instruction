import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter first number: ");
			int x = sc.nextInt();
			System.out.print("Enter second number: ");
			int y = sc.nextInt();

			while (x != 0) {
				while (y >= x) {
					y -= x;
				}

				int temp = x;
				x = y;
				y = temp;
			}
			choice = sc.nextLine();
			System.out.println("Greatest common divisor: " + y);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
		System.out.print("\nBye");
	}

}
