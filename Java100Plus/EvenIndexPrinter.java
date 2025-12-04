package Java100Plus;

public class EvenIndexPrinter {

    public static void printEvenIndexedChars(String str) {
        System.out.println("Input: \"" + str + "\"");
        System.out.print("Output: ");

        // Loop 0 index se shuru karein
        for (int i = 0; i < str.length(); i++) {
            // Check karein ki index even (sam) hai ya nahi
            if (i % 2 == 0) {
                // Agar sam hai, to character print karo
                System.out.print(str.charAt(i));

                // Aakhri character ke baad comma na print ho, isliye check karein
                if (i < str.length() - 2) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "programming";
        printEvenIndexedChars(input);
    }
}
