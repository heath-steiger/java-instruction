package util;

import java.util.List;
import java.util.Scanner;

public class MyConsole {
	static Scanner sc = new Scanner(System.in);

	// numbers---------------------------------------------------------
	
	public static double promptDouble(String prompt) {
		boolean isValid = false;
		double result = 0.0;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				result = Double.parseDouble(sc.nextLine());
				isValid = true;
			} else {
				System.err.println("Error - invalid entry. Try again.");
				sc.nextLine(); // discard the input
			}
		}
		return result;
	}
	public static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			} else {
				System.err.println("Error - invalid entry. Try again.");
				sc.nextLine(); 
			}
		}
		return result;
	}
	 public static int promptInt(String message, int min, int max)
	 {
	     int result = 0;
	     boolean isValid = false;
	     while (!isValid) {
	         result = promptInt(message);
	         if (result >= min && result <= max) {
	             isValid = true;
	         }
	         else { printLine("Error - string must be between " + min + " or " + max); }

	     }
	         return result;
	 }
	 // strings--------------------------------------------------------------------
	 
	 
	 public static String promptReqString(String prompt, String str1, String str2)
	 {
		 String result = " ";
		 boolean isValid = false;
		 while (!isValid) {
			 result = promptString(prompt);
			 if (result.trim() != " ") {
				 if (result == str1 || result == str2) {
					 isValid = true;
				 }
				 else {
					 printLine("Error - string must be either " + str1 + " or " + str2);
				 }
			 }
			 else {
				 printLine("Error - entry is required.");
			 }
		 }
		 return result;
	 }
	 public static String promptString(String prompt, List<String> validValues) {
			String str = "";
			boolean success = false;
			while (!success) {
				str = promptString(prompt);
//				for (String s: validValues) {
//					if (s.equalsIgnoreCase(str)) {
//						success = true;
//						break;
//					}
//				}
				if (validValues.contains(str)) {
					success = true;
				}
				else {
					printLine("Invalid value. Try again.");
				}
			}
			return str;
		}
	 public static String promptString(String prompt) {
		 System.out.print(prompt);
		 return sc.nextLine();
	 }
	 public static void print(String msg)
	 {
	     System.out.print(msg);
	 }
	 public static void printLine(String msg)
	 {
	     System.out.println(msg);
	 }
	 public static void printLine()
	 {
	     System.out.println();
	 }
	 public static void printHeader(String header, String sep) {
	        String line = sep.repeat(header.length());
	        printLine(header);
	        printLine(line);
	 }
	 public static void printHeader(String header) {
		 printHeader(header, "=");
	        
	 }
	 
}
