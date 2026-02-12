package Java100Plus;

public class reverseTheorderofString52 {
    public static void main(String[] args) {
        String input = "Java is best";

        // FIX 1: Split by space (" ")
        String[] words = input.split(" ");

        // FIX 2: StringBuilder ka use efficient string building ke liye
        StringBuilder rev = new StringBuilder();

        // Words array ko peechhe se traverse karo
        for (int i = words.length - 1; i >= 0; i--) {
            // Current word ko jod do
            rev.append(words[i]);

            // Har word ke baad space jod do (aakhri word ko chhodkar)
            if (i > 0) {
                rev.append(" ");
            }
        }
        System.out.println (rev );
        // Final reversed string print karein



//
//        class Solution {
//            public String reverseEachWord(String s) {
//                // Step 1: String ko space (" ") se split karke words ka array banao
//                String[] words = s.split(" ");
//
//                // Final result ko efficiently banane ke liye StringBuilder ka use karein
//                StringBuilder result = new StringBuilder();
//
//                // Har word par loop chalao
//                for (String word : words) {
//
//                    // Step 2: Har word ko reverse karo
//                    StringBuilder sb = new StringBuilder(word);
//                    sb.reverse(); // Example: "Java" becomes "avaJ"
//
//                    // Step 3: Reversed word aur space ko final result me jod do
//                    result.append(sb).append(" ");
//                }
//
//                // Step 4: Final string se aakhri extra space ko trim() se hata do
//                return result.toString().trim();
//            }
//
//            public static void main(String[] args) {
//                String input = "Java is best";
//                String reversed = new Solution().reverseEachWord(input);
//
//                System.out.println("Input: \"" + input + "\"");
//                System.out.println("Output: \"" + reversed + "\""); // Output: "avaJ si tseb"
//            }
//        }



    }
}
