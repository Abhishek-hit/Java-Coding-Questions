package Recursion;

import java.util.Scanner;

public class SumOfNumber {
    public static int sumofnumber(int n){
        if(n==1){
            return 1;
        }
        int sum=sumofnumber (n-1);
        return n+sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a number");
        int num=sc.nextInt ();

        System.out.println ( sumofnumber (num) );
    }
}
