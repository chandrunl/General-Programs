package arithmeticPrograms;
public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 78, 23, 89, 34};
        int max = numbers[0]; // Assume first element is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger value is found
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
}
