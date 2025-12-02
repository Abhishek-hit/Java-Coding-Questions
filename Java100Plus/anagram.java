package Java100Plus;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "listen"; String str2 = "silghgh";

        char[] arr=str1.toCharArray ();
        Arrays.sort (arr);
        char[] arr1=str2.toCharArray ();
        Arrays.sort (arr1);
//      if (Arrays.equals (arr,arr1)){
//          System.out.println("Anagram");
//      }

        //loopse
        boolean isAnagram = true;

        for (int i = 0; i < arr1.length; i++) {
            // Sorted arrays ke har index ko compare karo
            if (arr[i] != arr1[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
