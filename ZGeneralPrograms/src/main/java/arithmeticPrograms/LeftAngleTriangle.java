package arithmeticPrograms;

import org.testng.annotations.Test;

public class LeftAngleTriangle {
	@Test
    public static void Test() {
        int n = 5; // number of rows
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // print a star
            }
            System.out.println(); // move to the next line
        }
    }
}

