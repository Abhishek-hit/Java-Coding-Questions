package Java100Plus;

public class ReverseHello {
    public static void main(String[] args) {
        String str = "Hello world";
        String[] strings = str.split(" ");

        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            String rev = "";

            // Loop ko peeche se aage ki taraf chalayein
            for (int j = chars.length - 1; j >= 0; j--) {
                rev = rev + chars[j]; // chars array se character uthayein
            }

            System.out.print(rev+" ");
        }
    }
}
