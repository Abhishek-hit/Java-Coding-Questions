package Java100Plus;

public class DoubleLetterPrinter {

    public static String printEachLetterTwice59(String str) {
        StringBuilder result = new StringBuilder();

        // Har character par loop chalao
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Character ko do baar append karo
            result.append(ch);
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hi";
        String output = printEachLetterTwice59 (input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");

        String input2 = "code";
        String output2 = printEachLetterTwice59 (input2);
        System.out.println("Input: \"code\"");
        System.out.println("Output: \"" + output2 + "\""); // Expected: ccoodeed
    }
}