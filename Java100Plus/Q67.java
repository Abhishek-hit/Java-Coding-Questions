package Java100Plus;

public class Q67 {
    public static void main(String[] args) {
        String input="banana";
        char[] str=input.toCharArray ();
        boolean[] visited=new boolean[str.length];
        int maxCount=0;
        char maxChar=' ';
        for (int i=0;i< str.length;i++) {
            if (visited[i]) {
                continue;
            }
            char currentChar = str[i];
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (currentChar == str[j]) {
                    count++;
                    visited[j] = true;
                }
                if (count > maxCount) {
                    maxCount = count;      // Naya max update karo
                    maxChar = currentChar; // Us character ko store karo
                }
            }

        }
        System.out.println("most frequency ch:- " + maxChar );
        System.out.println("frequency: " + maxCount);

    }
    }

