package Java100Plus;

public class SpaceRemover {

    public static String removeSpaces(String str) {
        // String me se sabhi space characters (" ") ko khali string ("") se replace karo
        String result = str.replaceAll(" ", "");

        // Agar aap chahte hain ki tabs aur newlines jaise sabhi whitespace bhi remove ho,
        // to aap ye use kar sakte hain: str.replaceAll("\\s", "");

        return result;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String output = removeSpaces(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
    }
}