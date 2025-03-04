package arithmeticPrograms;

public class Factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base Case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive Case: n * factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 9; // Change this value to compute factorial of another number
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}

