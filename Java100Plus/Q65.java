package Java100Plus;

public class Q65 {

    public static String moveNonDigitsToEnd(String str) {
        // Digits (numbers) ko store karne ke liye (Ye pehle aayega)
        StringBuilder digits = new StringBuilder();

        // Non-Digits (letters, symbols, space) ko store karne ke liye (Ye aakhir me aayega)
        StringBuilder nonDigits = new StringBuilder();

        // Har character par loop chalao
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check karein ki character digit hai (0-9)
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
            // Agar digit nahi hai, to woh non-digit hai
            else {
                nonDigits.append(ch);
            }
        }

        // Final String banane ke liye: Digits + Non-Digits
        // Hum digits mein nonDigits ko append kar rahe hain
        digits.append(nonDigits);

        return digits.toString();
    }

    public static void main(String[] args) {
        String input1 = "ab12cd3";
        System.out.println("Input: " + input1 + " -> Output: " + moveNonDigitsToEnd(input1));

        String input2 = "H3l1o@W0r1d";
        System.out.println("Input: " + input2 + " -> Output: " + moveNonDigitsToEnd(input2));
    }
}
