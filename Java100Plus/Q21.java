package Java100Plus;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a number A" );
        int a= sc.nextInt ( );
        System.out.println ("enter a number B" );
        int b=sc.nextInt ();
        int n1=a;
        int n2=b;

        while (n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
            int hcf = n2;

        } // Formula ka use karke LCM nikala
        int hcf = n2;
        int lcm = (a * b) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }
}
