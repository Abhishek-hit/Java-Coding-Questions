import java.util.Scanner;

public class SumOfDigitNum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter the a digit number" );
        int num=sc.nextInt ();
        int rem=0,temp=num;
        while (num>0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println ("Sum of digit number " +temp+ " is "  +sum);
    }
}
