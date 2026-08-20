package JAVAREVISION;

import java.util.Scanner;

public class divideby5ornot {
    public  static  int divide(int sum){
        if (sum%5==0&&sum%3==0){
            System.out.println ("divided by 3 nad 5" );
            return 0;
        }
        else System.out.println ("mot divided by "+sum );
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a num" );
        int num= sc.nextInt ( );
        divide (num);

    }
}
