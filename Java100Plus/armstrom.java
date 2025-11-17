package Java100Plus;

public class armstrom {
    public static void main(String[] args) {
        int num=1535,rem,sum=0,numbs=num;
        while (num>0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;

        }
        if (sum==numbs){
        System.out.println ("number is arms "  + numbs );

    }else System.out.println ("number is not arms" );
    }
}
