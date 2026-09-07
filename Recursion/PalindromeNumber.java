package Recursion;

import java.util.Scanner;

public class PalindromeNumber {
     static int rev=0; //yaha rakhe ge taki iski recursive call me iski value bani rhe
    public static int palin(int n){

        if (n==0){
            return 0;
        }

        int rem=n%10;
         rev=rev*10+rem;
         palin (n/10);

       return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a number" );
        int num= sc.nextInt ( );

        palin(num);
        if (num == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        sc.close();
    }
}

//
//public static int reverse(int n, int rev) {
//    if (n == 0) {
//        return rev;
//    }
//
//    int rem = n % 10;
//    rev = rev * 10 + rem;
//
//    return reverse(n / 10, rev);
//}
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter a number");
//    int num = sc.nextInt();
//

//    int reversedNum = reverse(num, 0);
//

//    if (num == reversedNum) {
//        System.out.println("palindrome");
//    } else {
//        System.out.println("not");
//    }
//
//    sc.close();
//}
//}