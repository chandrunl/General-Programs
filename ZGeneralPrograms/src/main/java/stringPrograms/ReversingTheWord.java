package stringPrograms;
/**
 * Hello world!
 */
public class ReversingTheWord {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);             
        }
        System.out.println("Reversed String: " + reversed);
    }
}
/*i = 10: reversed = reversed + input.charAt(10) → reversed = "" + 'd' → "d"
i = 9: reversed = reversed + input.charAt(9) → reversed = "d" + 'l' → "dl"
i = 8: reversed = reversed + input.charAt(8) → reversed = "dl" + 'r' → "dlr"
i = 7: reversed = reversed + input.charAt(7) → reversed = "dlr" + 'o' → "dlro"
i = 6: reversed = reversed + input.charAt(6) → reversed = "dlro" + 'W' → "dlroW"
i = 5: reversed = reversed + input.charAt(5) → reversed = "dlroW" + ' ' → "dlroW "
i = 4: reversed = reversed + input.charAt(4) → reversed = "dlroW " + 'o' → "dlroW o"
i = 3: reversed = reversed + input.charAt(3) → reversed = "dlroW o" + 'l' → "dlroW ol"
i = 2: reversed = reversed + input.charAt(2) → reversed = "dlroW ol" + 'l' → "dlroW oll"
i = 1: reversed = reversed + input.charAt(1) → reversed = "dlroW oll" + 'e' → "dlroW olle"
i = 0: reversed = reversed + input.charAt(0) → reversed = "dlroW olle" + 'H' → "dlroW olleH*/
//third statement (i--) is executed after each iteration of the loop body, not before or during the first iteratio
/* 
 *
 * public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        StringBuilder sb = new StringBuilder(input);

        System.out.println("Reversed String: " + sb.reverse().toString());
    }
}
*
*
*/




