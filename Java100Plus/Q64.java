package Java100Plus;

public class Q64{

    public static void separateLettersAndNumbers(String str) {
        // Letters Ko store
        StringBuilder letters = new StringBuilder();

        // Numbersko sotre
        StringBuilder numbers = new StringBuilder();

        // Har character par loop chalao
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check karein ki character letter hai ya nahi a-z
            if (Character.isLetter(ch)) {
                letters.append(ch);
            }
            // Check karein ki character digit (number) h ya nhi
            else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
            // Agar character space, special symbol,ignore
        }

        // Output Print karein
        System.out.println("Input: \"" + str + "\"");
        System.out.println("Output: Letters: \"" + letters.toString() + "\", Numbers: \"" + numbers.toString() + "\"");
    }

    public static void main(String[] args) {
        String input1 = "java123";
        separateLettersAndNumbers(input1);

        String input2 = "Code_123_4U";
        separateLettersAndNumbers(input2); // Note: Underscore (_) ignore ho jayega
    }
}
