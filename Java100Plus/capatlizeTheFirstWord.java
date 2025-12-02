package Java100Plus;

public class capatlizeTheFirstWord {
    public static void main(String[] args) {
        String input = "hello world java";

        // 1. String ko words mein todo
        String[] words = input.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            // Check karein ki word khali na ho (extra spaces ke case mein)
            if (word.length() > 0) {

                // Pehla akshar bada karo
                char firstChar = Character.toUpperCase(word.charAt(0));

                // Baki ka word nikaalo
                String rest = word.substring(1);

                // Jod kar Builder mein daalo (Saath mein space)
                sb.append(firstChar).append(rest).append(" ");
            }
        }

        // Aakhri ka extra space hatane ke liye .trim()
        System.out.println("Original: " + input);
        System.out.println("Result:   " + sb.toString().trim());
    }
}
