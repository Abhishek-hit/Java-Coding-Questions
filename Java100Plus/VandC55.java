package Java100Plus;

public class VandC55 {
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // String ko case-insensitive banane ke liye lower case me badlein
        String lowerStr = str.toLowerCase();

//        // **BADLAV:** String ko char array me badlein
//        char[] chars = lowerStr.toCharArray();
//
//        // Har character par loop chalao
//        // Array ke elements ko access karne ke liye enhanced for loop ka upyog kar sakte hain
//        for (char ch : chars)

        // Har character par loop chalao
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // 1. Check karein ki character alphabet hai ya nahi
            if (ch >= 'a' && ch <= 'z') {

                // 2. Agar alphabet hai, to check karein ki vowel hai ya nahi
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    // Agar alphabet hai, par vowel nahi hai, to consonant hai
                    consonantCount++;
                }
            }
            // Agar character space ya koi number hai, to use ignore kar diya jayega.
        }

        // Output Print karein
        System.out.println("Input: \"" + str + "\"");
        System.out.println("Output: Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String input1 = "Hello";
        countVowelsAndConsonants(input1);

        String input2 = "Programming is Fun";
        countVowelsAndConsonants(input2);
    }

}
