package ui;

import model.Actors;
import model.Movie;
import util.MyConsole;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		
		MyConsole.printHeader("Enter your favorite Movie!");
		
		
		int id = MyConsole.promptInt("\nID: ");
		String title = MyConsole.promptString("Title: ");
		int year = MyConsole.promptInt("Enter year: ");
		String rating = MyConsole.promptString("Rating: ");
		String director = MyConsole.promptString("Director: ");
		Movie m1 = new Movie(id, title, year, rating, director);
			
		MyConsole.printHeader("\nEnter your favorite Actor!");
		int actorid = MyConsole.promptInt("\nID: ");
		String firstName = MyConsole.promptString("Firstname: ");
		String lastName = MyConsole.promptString("Lastname: ");
		String gender = MyConsole.promptString("Gender (m/f): ");
		String birthDate = MyConsole.promptString("Birthdate: ");
		Actors a1 = new Actors(actorid, firstName, lastName, gender, birthDate);
	}
 
}
