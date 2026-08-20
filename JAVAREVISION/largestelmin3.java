package JAVAREVISION;

import java.util.Scanner;

public class largestelmin3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a 3 number " );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        if ((a>=b)&& (a>=c)){
//            System.out.println ("largest numbe is a"+a );
//        }else
//            if (b>=a&&b>=c){
//                System.out.println ("largest number is b"+b );
//            } else if (c>=a&&c>=b) {
//                System.out.println ("largest number is c"+c );
//            }
        int largest=Math.max (a,Math.max (b,c));
        System.out.println ("largest"+largest );
    }
}
