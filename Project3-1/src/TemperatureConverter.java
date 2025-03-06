import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Temperature Converter ");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter degrees in Fahrenheit: ");
			double f = sc.nextDouble(); 
			double celsius = ((f-32) * (5.0/9));
			System.out.println("Degrees in Celsius: "+((double)  Math.round(celsius*100)/100));
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
	}

}
