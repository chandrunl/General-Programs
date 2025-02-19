package stringPrograms;

public class LambaBlock {
    public static void main(String[] args) {
        MathOperation multiplication = (a, b) -> {
            System.out.println("Multiplying " + a + " and " + b);
            return a * b;
        };
        System.out.println("Result: " + multiplication.multiply(3, 4));
    }

}
