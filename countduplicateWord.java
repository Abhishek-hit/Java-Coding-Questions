public class countduplicateWord {
    public static void main(String[] args) {
        String str = "Java is a programming language and Java is popular";
        str = str.toLowerCase();

        String[] words = str.split(" ");
        int count;
        int duplicateCount = 0;

        System.out.println("Duplicate Words:");

        for (int i = 0; i < words.length; i++) {
            count = 1;

            if (words[i].equals("0"))  // skip already counted words
                continue;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0"; // mark visited duplicate
                }
            }

            if (count > 1) {
                System.out.println(words[i] + " → " + count);
                duplicateCount++;
            }
        }

        System.out.println("Total duplicate words = " + duplicateCount);
    }
}
