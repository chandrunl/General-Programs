package arithmeticPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Madam";
        String original = str.toLowerCase(); // Case insensitive
        String reversed = "";

        // Reverse the string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }        
    }
}
