package Java100Plus;

public class charposition51 {
    public static void main(String[] args) {
        String str= "ABC";

//        char[] str=input.toCharArray ();
//        int position = 1;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int position = i + 1; // 1-based indexing
            System.out.print(character + " " + position + " ");
        }
        System.out.println();

//        for (char character : chars) {
//            System.out.print(character + " " + position + " ");
//            position++;
//        }
//        System.out.println();
    }
}
