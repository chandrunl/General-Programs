package stringPrograms;

public class ReversingEachWordInSentence {
    public static void main(String[] args) {
        String input = "Hello World";
        String[] words = input.split(" "); // Split the sentence into words
        String reversedSentence = "";

     for (String word : words) { // Loop through each word
            String reversedWord = ""; // Initialize reversed word
            for (int i = word.length() - 1; i >= 0; i--) { // Reverse the word
                reversedWord += word.charAt(i);
            }
            reversedSentence += reversedWord + " "; // Add the reversed word to the sentence
        }
        System.out.println("Reversed String: " + reversedSentence.trim()); // Print the result
    }
}

//(for-each loop) in Java. It is specifically designed for iterating over arrays or collections like lists, sets, and maps
/*
public class ReversingEachWordInSentence {
public static void main(String[] args) {
    String input = "Hello World";
    String[] words = input.split(" "); // Split the sentence into words
    StringBuilder reversedSentence = new StringBuilder(); // StringBuilder to store the result

    for (String word : words) { // Loop through each word
        StringBuilder reversedWord = new StringBuilder(word); // Initialize StringBuilder for the word
        reversedSentence.append(reversedWord.reverse()).append(" "); // Reverse the word and append to result
    }
    System.out.println("Reversed String: " + reversedSentence.toString().trim()); // Print the result
}
}
*/