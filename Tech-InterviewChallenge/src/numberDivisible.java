import java.util.*;


public class numberDivisible {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		for(int nbr = 1; nbr <= 100; nbr++) {
			
			String nbrString = Integer.toString(nbr);
			int nbrDigits = nbrString.length();
			char[] digitsCharArray = nbrString.toCharArray();
			List<Integer> digitsIntList = new ArrayList<>();
	        for (char c : digitsCharArray) {
	            digitsIntList.add(Integer.parseInt(String.valueOf(c)));
	        }
	        boolean include = true;
	        for (int d: digitsIntList){
	        	if ( nbr % d!=0) {
	        		include = false;
	        		break;
	        	}
	        	//include = (nbr % d != 0) ? false : true;
	        }
	        if (include)
	        {
	        	nums.add(nbr);
	        }
		}
		nums.stream().forEach(n -> System.out.println(n));
	}
}
