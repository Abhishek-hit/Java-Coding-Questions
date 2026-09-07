package Recursion;

import java.util.Scanner;

public class SumOfDigit {
    public static int sumofdigit(int n){
        if(n==0){
            return n;
        }
//        int rem=n%10;
//        return sumofdigit (n/10)+rem;
//        or we can

        return sumofdigit (n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a number");
        int num=sc.nextInt ();

        System.out.println ( sumofdigit (num) );
    }
}
