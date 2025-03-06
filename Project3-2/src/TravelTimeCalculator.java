import java.util.Scanner;


public class TravelTimeCalculator {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Travel Time Calculator");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter miles: ");
			double miles = sc.nextInt(); 
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextInt(); 
			double time = (miles / mph);
			int hours = (int) time;
			int minutes = (int) Math.round((time - hours) * 60); 
			System.out.println("Estimated travel time");
			System.out.println();
			System.out.println("hours:     "+hours);
			System.out.println("Minutes:   "+minutes);
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
		
		
	}
}
