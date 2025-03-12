package arithmeticPrograms;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 10; // Change this number to test

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; // Not a prime if divisible
                    break;
                }
            }
        }

        // Print result
        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }

}
