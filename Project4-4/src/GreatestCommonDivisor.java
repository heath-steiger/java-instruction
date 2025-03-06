import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter first number: ");
		int nbr1 = sc.nextInt(); 
		System.out.print("Enter second number: ");
		int nbr2 = sc.nextInt();
	     
		
		while(nbr1 != 0){
			while (nbr1 >= nbr2 ) {
				nbr1 -= nbr2;
			}
			
			   int temp = nbr1;
	            nbr1 = nbr2;
	            nbr2 = temp;
		}
		System.out.println("Greatest common divisor: " + nbr2);	
		System.out.print("\nContinue? (y/n): ");
		choice = sc.nextLine();
		}
	}

}
