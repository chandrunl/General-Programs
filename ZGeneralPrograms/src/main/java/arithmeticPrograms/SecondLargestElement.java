package arithmeticPrograms;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 78,79, 23, 89, 34};

        // Step 1: Sort the array using Bubble Sort with Swap inside the main method
        int n = numbers.length;
       /* for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }*/
        Arrays.sort(numbers);

        // Step 2: Get the second largest element (second last element in sorted array)
        int secondLargest = numbers[numbers.length - 2];

        // Step 3: Output the second largest element
        System.out.println("Second largest element in the array: " + secondLargest);
    }
}


