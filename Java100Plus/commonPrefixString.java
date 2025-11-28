package Java100Plus;

import java.util.Arrays;

public class commonPrefixString {
    public static String commonPrefix(String[] strs){
        if (strs==null || strs.length==0){
            return "";
        }
        Arrays.sort (strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int idx = 0;
        for (int i=0;i<s1.length ();i++){
            for (int j=0;j<s2.length ();j++){
                if (s1.charAt (idx)==s2.charAt (idx)){//compare krege
                    idx++;
                }else break;;
            }
        }
        return s1.substring (0,idx);//common ko return krege
    }
    public static void main(String[] args) {
        String[] input={"flower","flow","flight"};
        System.out.println (commonPrefix (input) );
    }
}
