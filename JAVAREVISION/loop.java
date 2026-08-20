package JAVAREVISION;

import java.util.Scanner;

public class loop {
   public static void main(String[] args) {
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            } else {
//                System.out.println("odd " + i);
//            }
//        }

//        int i=1;
//        while ( i<10){
//            {System.out.println (i );
//            }
//            ++i;
//
//        }

//       print table
//       Scanner sc=new Scanner (System.in);
//       System.out.println ("enter a number" );
//       int num= sc.nextInt ( );
//       for (int i=1;i<=10;i++){
//           int table=i*num;
//           System.out.println (i+"*"+num+"\t"+table );
//       }
//       print ap
//       int n=10;
//       for (int i=2;i<=3*n-1;i+=3){
//           System.out.print(" "+i );
//       }
       //gp
//       int a=1;
//       int r=2;
//       for (int i=1;i<=10;i++){
//           System.out.print(" "+a );
//           a*=r;
//
//       }

//       reverse number
//       int  num =1480;
//       int rev=0;
////       int temp=num;
//       while (num!=0){
//          int rem=num%10;
//         rev=rev*10+rem;
//         num=num/10;
//       }
//       System.out.println (rev );

//       binary
       int num = 1480;
       String binary = "";

       while (num != 0) {
           int rem = num % 2;
           binary = rem + binary; // Digit ko aage jod rahe hain taaki reverse na ho
           num = num / 2;
       }

       System.out.println(binary); // Output: 10111001000
    }
}
