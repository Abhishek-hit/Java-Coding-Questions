package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static String rev(String s,int n){
        if (n==s.length ()){
            return "";
        }
        String samllanswer=rev (s,n+1);
        return samllanswer+s.charAt (n);

    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println ("enter a string");
      String str=sc.nextLine ();
      System.out.println (rev(str,0) );
      if (str.equals (rev (str,0))){
          System.out.println ("palindoem" );
      }else System.out.println ("not" );


//        String str="hello world";
//        char[] chars=str.toCharArray ();
//        int l=0;
//        int r=chars.length-1;
//        while (l<r){
//            char temp=chars[l];
//            chars[l]=chars[r];
//            chars[r]=temp;
//            l++;r--;
//        }
//        System.out.println (chars );
    }
}
