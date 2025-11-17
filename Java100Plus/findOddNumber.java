package Java100Plus;

public class findOddNumber {
    public static void main(String[] args) {
        int sum=0,count=0;
        for (int i=0;i<100;i++){
            if (i%2!=0){
                 sum=sum+i;
                 count++;
             //  System.out.println ("Odd Number:\t"+i );
            }
//
//            if (i%2==0) {
//                System.out.println ("even number\t"+i );
//
//            }
        }
        System.out.println("sum is "+sum );
        System.out.println ("count"+count );

    }


}
