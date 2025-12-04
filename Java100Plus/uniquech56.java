package Java100Plus;

import java.util.HashSet;
import java.util.Set;

public class uniquech56 {

    public static void printUniqueCharacters(String str) {
        // HashSet banao jo sirf unique characters ko store karega
        Set<Character> uniqueChars = new HashSet<> ();

        // String ke har character par loop chalao
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Character ko set me add karo. Set automatically duplicates ko ignore kar dega.
            uniqueChars.add(ch);
        }

        // Output Print karein
        System.out.println("Input: \"" + str + "\"");
        System.out.print("Output: ");

        // Set me stored unique characters ko print karein
        boolean first = true;
        for (char ch : uniqueChars) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(ch);
            first = false;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input1 = "banana";
        printUniqueCharacters(input1);

        String input2 = "Programming";
        printUniqueCharacters(input2);
    }
}
