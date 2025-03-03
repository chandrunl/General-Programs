package arithmeticPrograms;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        // Closing scanner
        scanner.close();

	}

}
