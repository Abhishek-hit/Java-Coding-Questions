package Java8;

public class firstp {
    interface math{
        int calculate(int val);

    }
    public static void main (String[] args){
        Runnable runnable=()-> System.out.println ("hello this is lamda " );
        runnable.run ();

      math runnable1=x-> x*2;
        System.out.println (runnable1.calculate (10) );

    }
}
