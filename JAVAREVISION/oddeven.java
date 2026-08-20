package JAVAREVISION;

import java.util.Scanner;

public class oddeven {
    public static  int oddoreven(int num){
        if (num%2==0){
            System.out.print("numver is evnen " );
            return num;
        }else System.out.println ("odd" );
        return num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a input" );
        int input= sc.nextInt ( );
        System.out.println (  oddoreven (input) );
    }
}
