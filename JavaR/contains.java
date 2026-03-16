package JavaR;

import java.util.Arrays;

public class contains {
    public static void main(String[] args) {
        String str="hello what is your name tell me";
        System.out.println (str.contains ("abc") );
        System.out.println (str.contains ("is") );
        System.out.println (str.indexOf ("e") );
        System.out.println (str.startsWith ("hello") );

        //in this we will learn how to manupulate a string
        System.out.println (str.substring (5) );
        System.out.println (str.trim () );
        System.out.println (str.split ("") );
        String[] words = str.split(" ");
        //
        System.out.println("Split Words: " + Arrays.toString(words));

        // 8. toCharArray(): आपके लूप वाले लॉजजक के ललए
        char[] chars = str.toCharArray();
        System.out.println("First char from Array: " + chars[8]);
    }
}
