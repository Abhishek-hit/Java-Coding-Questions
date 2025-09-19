import java.util.Scanner;

public class sumofnumbers {
    //recurcive ke liye
    public static int addodd(int n){
        if (n<=0){
            return 0;
        }
        if (n%2!=0){
            return n+addodd (n-2);
        }else {
            return addodd (n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter the number you want to add" );
        int add= sc.nextInt ( );
        int sum=0;
        int count=0;
        for (int i=0;i<=add;i++){
            if (i%2!=0){
                count++; //odd  number calculate
            }
            sum=sum+i;
        }
        System.out.println("the sum of you entered num is "+sum );
        System.out.println ("total odd number is" +count );

        int result=addodd (100);
        System.out.println ("recursive" +result);

    }

}
