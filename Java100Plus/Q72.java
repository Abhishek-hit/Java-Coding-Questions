package Java100Plus;

public class Q72 {
    public static void main(String[] args) {
        String input="Test@123";
        char[] chars=input.toCharArray ();

        int charcount=0;
        int digitcount=0;
        int specialcount=0;
        for (int i=0; i<chars.length;i++){
            if (Character.isDigit (chars[i])){
                digitcount++;
            } else if (Character.isLetter (chars[i])) {
               charcount++;
            } else if (!Character.isWhitespace (chars[i])) {
                specialcount++;


            }
        }
        System.out.println ("digit cunt"+digitcount );
        System.out.println ("char cunt"+charcount );
        System.out.println ("special cunt"+specialcount);

        //second way to solve to this questions

//        int charCount = 0;
//        int digitCount = 0;
//        int specialCount = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//
//            // 1. Check for Alphabets
//            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//                charCount++;
//            }
//            // 2. Check for Digits
//            else if (ch >= '0' && ch <= '9') {
//                digitCount++;
//            }
//            // 3. Rest are Special Characters (excluding space if you want)
//            else if (ch != ' ') {
//                specialCount++;
//            }
//        }
//
//        System.out.println("Characters: " + charCount);
//        System.out.println("Digits: " + digitCount);
//        System.out.println("Special: " + specialCount);
    }
}
