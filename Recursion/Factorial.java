package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fac=factorial (n-1);
        return n*fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a number");
        int num=sc.nextInt ();

        System.out.println ( factorial(num) );
    }
}
