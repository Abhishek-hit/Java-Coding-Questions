package Java100Plus;

public class ReplaceVowel50 {
//    string builder5

    public static String replaceVowels(String s) {
        // StringBuilder ka upyog string ko efficiently modify karne ke liye kiya jata hai
        StringBuilder result = new StringBuilder();

        // Vowels ki definition
        String vowels = "aeiouAEIOU";

        // Har character par loop chalao
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 1. Check karo ki kya current character 'vowels' string me maujood hai
            // indexOf() agar character nahi milta to -1 return karta hai
            if (vowels.indexOf(currentChar) != -1) {
                // Vowel hai, to '*' jod do
                result.append('*');
            } else {
                // Vowel nahi hai, to original character jod do
                result.append(currentChar);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
          String Input= "programming";
          char [] input=Input.toCharArray();
        String vowels = "aeiouAEIOU";
        for (int i=0;i<input.length;i++){
            if (vowels.indexOf (input[i])!=-1){
                input[i]='*';
            }
        }
        System.out.println (new String ( input ) );

        //String biluider
        String nput = "programmingiksoei";
        String output = replaceVowels(nput);

        System.out.println("Input: " + nput);
        System.out.println("Output: " + output);

    }
}
