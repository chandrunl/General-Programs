package arithmeticPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
        int num = 121, Temp = num, reversed = 0;

        while (num > 0) {
            int Remainder = num % 10;
            reversed = reversed * 10 + Remainder;
            num =num/10;
        }

        if (Temp == reversed) {
            System.out.println(Temp + " is a palindrome");
        } else {
            System.out.println(Temp + " is not a palindrome");
        }
	}
}