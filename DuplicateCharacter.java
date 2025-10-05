public class DuplicateCharacter {
    public static void main(String[] args) {
            String str = "programming";
            str = str.toLowerCase();

            char[] chars = str.toCharArray();
            int count;
            int duplicateCount = 0;

            System.out.println("Duplicate characters:");

            for (int i = 0; i < chars.length; i++) {
                count = 1;

                if (chars[i] == '0' || chars[i] == ' ') // skip visited or space
                    continue;

                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        chars[j] = '0'; // mark visited
                    }
                }

                if (count > 1) {
                    System.out.println(chars[i] + " → " + count);
                    duplicateCount++;
                }
            }

            System.out.println("Total duplicate characters = " + duplicateCount);
        }
    }


