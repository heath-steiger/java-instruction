import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter an integer: ");
			int nbr = sc.nextInt();
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			for (int i = 1; i <= nbr; i++) {
				int square = i * i;
				int cube = i * i * i;
				System.out.println(i + "\t" + square + "\t" + cube);
			}
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
	}

}
