package stringPrograms;

public class CharOccuranceInString {
	 public static void main(String[] args) {
	        String str = "automation";
	        char target = 'a';
	        int count = 0;
	        
	        for (char c : str.toCharArray()) {
	            if (c == target) {
	                count++;
	            }
	        }	        
	        System.out.println("Character '" + target + "' appears " + count + " times.");
	    }
}
