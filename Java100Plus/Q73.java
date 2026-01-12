package Java100Plus;


public class Q73 {
    public static void main(String[] args) {
        String input = "HelloWorld";

        int capitalCount = 0;
        int smallCount = 0;

        for (char c : input.toCharArray()) {
            // Check if character is Uppercase (Capital)
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
            // Check if character is Lowercase (Small)
            else if (Character.isLowerCase(c)) {
                smallCount++;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Capital: " + capitalCount);
        System.out.println("Small: " + smallCount);
    }
}
