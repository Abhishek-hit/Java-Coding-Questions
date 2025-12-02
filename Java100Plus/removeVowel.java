package Java100Plus;

public class removeVowel {
    public static void main(String[] args) {

        String Input = "Welcome";

        String result = Input.replaceAll ("[aieou]", "");
        System.out.println (result);


        //without build in method
        //without bulid in method
        String input = "Welcome to the world ";
        StringBuilder sb = new StringBuilder();

        // Check karne ke liye ek reference string bana lo
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Logic: Agar 'ch' vowels wali list mein NAHI hai (-1),
            // tabhi use add karo.
            if (vowels.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        System.out.println("Result: " + sb.toString());

    }

}
