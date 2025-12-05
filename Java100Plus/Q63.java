package Java100Plus;

public class Q63 {

    public static void separateCases(String str) {
        // Lowercase characters ko store karne ke liye
        StringBuilder lowerCase = new StringBuilder();

        // Uppercase characters ko store karne ke liye
        StringBuilder upperCase = new StringBuilder();

        // Har character par loop chalao
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check karein ki character uppercase hai ya nahi
            if (Character.isUpperCase(ch)) {
                upperCase.append(ch);
            }
            // Check karein ki character lowercase hai ya nahi
            else if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            }
            // Agar character space, number, ya special symbol hai, to woh ignore ho jayega
        }

        // Output Print karein
        System.out.println("Input: \"" + str + "\"");
        System.out.println("Output: Lowercase: \"" + lowerCase.toString() + "\", Uppercase: \"" + upperCase.toString() + "\"");
    }

    public static void main(String[] args) {
        String input1 = "HelloJava";
        separateCases(input1);

        String input2 = "Code123Easy";
        separateCases(input2);
    }
}