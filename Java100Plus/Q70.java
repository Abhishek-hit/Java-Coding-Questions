package Java100Plus;

public class Q70 {
    public static void main(String[] args) {
        String input="hello!";
        boolean found= false;

        for (char c:input.toCharArray ()){

            if (!Character.isLetterOrDigit (c)&&!Character.isWhitespace (c)){
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println("Contains Special Characters");
        } else {
            System.out.println("Clean String");
        }

    }
}
