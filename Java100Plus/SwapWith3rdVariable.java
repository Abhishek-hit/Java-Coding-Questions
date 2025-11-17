package Java100Plus;

public class SwapWith3rdVariable {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=20;
        c=a;
        a=b;
        b=c;
        System.out.println ("Swapped numbers: a = " + a + ", b = " + b);
        //without third variable
//        a=a+b;
//        b=a-b;
//        a=a-b;
    }
}
