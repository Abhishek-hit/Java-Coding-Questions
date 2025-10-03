import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int sum=0,rem;
//        Scanner sc=new Scanner (System.in);
//        System.out.println ("enter the ann number " );
//        int n=sc.nextInt ();
//        int arm=n;
        for (int i=1;i<=1000;i++) {
            int n=i;
            while (n > 0) {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if (sum == i) {
                System.out.println("print this a arm number " + i);
            }
            sum=0;
        }
//        else
//            System.out.println ("this not arm numeber"+ arm);

    }
}
