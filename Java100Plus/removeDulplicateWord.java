package Java100Plus;

import java.util.Arrays;
import java.util.stream.Collectors;

public class removeDulplicateWord {
    public static void main(String[] args) {
        String str="java is fun and java is easy";
        String[] words=str.split (" ");
        for (int i = 0; i < words.length; i++) {

            // Check karo: Kya ye word pehle aa chuka hai?
            boolean pehleAaChukaHai = false;

            // 'j' ka loop 0 se lekar 'i' se ek pehle tak chalega (Piche dekhne ke liye)
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    pehleAaChukaHai = true; // Haan, mil gaya piche
                    break;
                }
            }

            // 3. Agar pehle nahi aaya tha, tabhi print karo
            if (!pehleAaChukaHai) {
                System.out.print(words[i] + " ");
            }

        }
        System.out.println ( );

//java 8

        String input = "java is fun and java is easy";

        String result = Arrays.stream(input.split(" ")) // 1. Split & Stream
                .distinct()               // 2. Duplicates hatao
                .collect(Collectors.joining(" ")); // 3. Wapas join karo

        System.out.println(result);
    }
}
