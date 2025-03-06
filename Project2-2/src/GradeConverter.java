import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to the Letter Grade Converter.");
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				Scanner sc = new Scanner(System.in);
				System.out.print("\nEnter numerical grade: ");
				int nbr = sc.nextInt();
				String grade = "F";
				if (nbr >= 88) {
					grade = "A";
				}
				else if (nbr >= 80) {
					grade = "B";
				}
				else if (nbr >= 67) {
					grade = "C";
				}
				else if (nbr >= 60) {
					grade = "D";
				}
				else if  (nbr < 60  )
				{ grade = "F";}
				
				System.out.println("Letter Grade: "+grade);
				sc.nextLine();
				System.out.print("\nContinue? (y/n): ");
				choice = sc.nextLine();
			}
				
				
	}

}
