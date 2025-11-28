package Java100Plus;

public class Unicode {
    public static void main(String[] args) {
        char character = 'a';

        // char ko int mein type-cast karein
        int unicodeValue = (int) character;

        System.out.println("Character 'a' ki Unicode Value (int) hai: " + unicodeValue);
        // Output: Character 'a' ki Unicode Value (int) hai: 97
    }

    }

