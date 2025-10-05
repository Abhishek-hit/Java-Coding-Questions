public class reversenumber {
    public static void main(String[] args) {

        int num=167;

        int rev=0;
        while (num>0){
           int rem=num%10;
            rev=rem+(rev*10);
            num=num/10;
        }
        System.out.print("reverse numb is "+rev);
    }
}
