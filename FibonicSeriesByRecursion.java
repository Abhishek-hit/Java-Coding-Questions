public class FibonicSeriesByRecursion {
    static void fibonic(int number){
        if (number<0){
            System.out.println ("invalid number " +number);
            return  ;
        }

        int prev1=1;
        int prev2=0;
        System.out.print(prev2 + " " +prev1+" ");


        // If n is 1, then we do not need to
        // proceed further
        if (number== 1)
            return;


        for (int i=3;i<=number;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
            System.out.print(curr +" ");
        }
    }
    public static void main(String[] args) {
        int number=0;
        fibonic (number);
    }
}
