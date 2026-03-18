package Java100Plus;

public class Q63i {
    public static void main(String[] args) {
        String str = "java123";
        char[] ch = str.toCharArray();

        String letters = "";
        String numbers = "";

        for (int i = 0; i < ch.length; i++) {
            // Character.isLetter() method ka use karenge
            if (Character.isLetter(ch[i])) {
                letters = letters + ch[i];
            }
            // Character.isDigit() numbers ke liye
            else if (Character.isDigit(ch[i])) {
                numbers = numbers + ch[i];
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);

    }
}
