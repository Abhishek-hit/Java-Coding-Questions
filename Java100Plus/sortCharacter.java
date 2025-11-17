package Java100Plus;

import java.util.Arrays;

public class sortCharacter {
    public static void main(String[] args) {

        String str="programminf";
        char[] data=str.toCharArray ();
        // 1. Arrays.sort() sirf array ko modify karta hai.
        Arrays.sort(data);

        // 2. Output ke liye naya String object banao:
        System.out.print(new String(data));

    }
}
