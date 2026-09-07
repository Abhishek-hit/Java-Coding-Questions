package Recursion;

import java.util.Scanner;

public class PrintNumberRevOrder {
    public static int printnum(int num){
        if (num==0){
            return 1;   //void ke sath return only
        }

        System.out.println (num );
        printnum (num-1);

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a number");
        int num=sc.nextInt ();
        printnum(num);
    }
}
