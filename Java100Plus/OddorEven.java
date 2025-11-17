package Java100Plus;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a number" );
        num=sc.nextInt ();
        if (num%2==0){
            System.out.println ("even" );
        }
        else System.out.println ("odd" );
    }
}
