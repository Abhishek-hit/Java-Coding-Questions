package Java100Plus;

public class Q69 {
    public static boolean containsDigitsLoop(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check karein ki character digit hai ya nahi
            if (Character.isDigit(ch)) {
                return true; // Agar digit milta hai, to turant true return karo
            }
        }

        // Agar poori string iterate ho gayi aur koi digit nahi mila
        return false;
    }
    public static void testChecker(String input) {
        boolean result = containsDigitsLoop(input);
        System.out.print("Input: \"" + input + "\" -> Output: ");
        System.out.println(result ? "Contains Digits" : "Does not contain Digits");
    }
    public static void main(String[] args) {
        testChecker("hello123");
        testChecker("hello");
        testChecker("123hello");
        testChecker("!@#$");

    }
}
