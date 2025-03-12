package stringPrograms;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, welcome to Java.";
        String[] words = str.split(" ");
        System.out.println("Total words: " + words.length);
    }

}