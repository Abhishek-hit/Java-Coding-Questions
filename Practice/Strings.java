package Practice;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args){
        String data="my is abhishek";
        System.out.println( "lenght is "+data.length());
        System.out.println("index of 9 "+ data.charAt (9));
        System.out.println (data.contains ("ads") );
        System.out.println (data.indexOf ("is") );//shows character first index
        System.out.println (data.startsWith ("jhj") );
        System.out.println (data.substring (6,9) ); //or only begining bhi like 6
        System.out.println (data.replace ("my","this") );
//     //word arrays ke liye
        String[] arry=data.split (" ");
        System.out.println ("word ko array me "+Arrays.toString (arry));
        //char arrya ke liye
        char[] chars=data.toCharArray ();
        System.out.println (Arrays.toString (chars) );
        for (int i=0;i< chars.length;i++){
            System.out.println (chars[i] );
        }
        for (int i=0;i< arry.length;i++){
            System.out.println (arry[i] );
        }
        //loop
        for(char k:chars){
            System.out.println ("loop is "+k );
        }
        for (String s:arry){
            System.out.println (s );
        }

    }
}
