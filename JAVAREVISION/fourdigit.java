package JAVAREVISION;

import java.util.Scanner;

public class fourdigit {
    public static void main(String[] args) {
//        int s=1480/10;
//        System.out.println (s );
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a number" );
        int num= sc.nextInt ( );
        int count=0;
        while (num!=0){
             num=num/10;
             count++;
        }
        System.out.println (count );
    }
}
