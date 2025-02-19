package arithmeticPrograms;

public class LeftAngleTriangleNumbers {
    public static void main(String[] args) {
        int n = 5; // number of rows
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // print numbers from 1 to i
            }
            System.out.println(); // move to the next line
        }
    }
}
