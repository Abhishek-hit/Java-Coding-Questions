package Java100Plus;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("how many number you want to find " );
        int N=sc.nextInt ();

        int count=0;
        int sum=0;
        int number=2;

        while (count<N){
            boolean isprime=true;
            for (int i=2;i<=Math.sqrt (number);i++){
                if (number%2==0){
                    isprime=false;
                    break;
                }
            }
            // Step 2: Agar Prime hai, toh print karo aur sum mein jodo
            if (isprime) {
                System.out.print(number + " ");
                sum = sum + number;
                count++;
            }

            number++; // Agla number check karo
        }
        System.out.println ( );
        System.out.println ("sum is"+sum );
        System.out.println ("avg is"+sum/N );

    }
}
