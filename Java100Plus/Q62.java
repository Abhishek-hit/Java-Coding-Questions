package Java100Plus;

public class Q62 {
    public static String encodeRLE(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder encodedString=new StringBuilder ();
        int n=str.length ();
        for (int i=0;i<n;i++){
            char currentChar=str.charAt (i);
            int count=1;
            // Inner check: Agle characters ko dekho jab tak woh current char ke barabar hain
            // i+1 < n check karta hai ki hum string ki seema se bahar na jaein
            while (i + 1 < n && str.charAt(i + 1) == currentChar) {
                count++;
                i++; // Index ko aage badha do
            }
            // Jab sequence toot jaye, to character aur count ko jod do
            encodedString.append(currentChar);
            encodedString.append(count);
        }
        return encodedString.toString();

    }
    public static void main(String[] args) {
        String input1 = "aabbcccdd";
        System.out.println("Input: " + input1 + " -> Output: " + encodeRLE(input1));

//        String input2 = "wwwwaaadexxxxxx";
//        System.out.println("Input: " + input2 + " -> Output: " + encodeRLE(input2));
//
//        String input3 = "a";
//        System.out.println("Input: " + input3 + " -> Output: " + encodeRLE(input3));
    }
}
