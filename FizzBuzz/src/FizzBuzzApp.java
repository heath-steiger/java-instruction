import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Fizz Buzz");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an integer: ");
		int nbr = sc.nextInt();
		for (int i = 1; i <= nbr; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + "fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println(i + "fizz");
			} else if (i % 3 == 0) {
				System.out.println(i + "buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
