import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to the Area and Perimeter Calculator");
			
			Scanner sc = new Scanner(System.in);
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.print("\nEnter length: ");
				double l = sc.nextInt(); 
				System.out.print("Enter width:  ");
				double w = sc.nextInt(); 
				double area = (w * l);
				double perimeter = (w*2)+(l*2);
				System.out.println("Area:         "+area);
				System.out.println("Perimeter:    "+perimeter);
				sc.nextLine();
				System.out.print("\nContinue? (y/n): ");
				choice = sc.nextLine();
			}
			
	}

}
