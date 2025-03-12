package stringPrograms;

public class ReverseTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sentence = "welcome to the pearson";
        String[] words = sentence.split(" ");
        
        // Looping through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

	}

}
