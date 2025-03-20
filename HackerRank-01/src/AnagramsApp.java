import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.MyConsole;

public class AnagramsApp {

	static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
//        if(a.length() != b.length()) {
//        	return false;
//        }
       
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA, arrayB);
        
	}
	
	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
//	        String a = scan.next();
//	        String b = scan.next();
		//  scan.close();
	        String a = MyConsole.promptString("enter word ");
	        String b = MyConsole.promptString("enter word ");
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
		
		// if length a != b == false
		// get word
		// convert to lower
		//put it into array
		//run through each char see how many times the character appears

	}

}
