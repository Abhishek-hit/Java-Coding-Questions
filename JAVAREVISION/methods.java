package JAVAREVISION;

import java.util.Scanner;

public class methods {
    public void  hello(){
        System.out.println ("hello how are you");
        int sum=sumNumb (10,20);
        System.out.println (sum );

    }
    public static void sum(int a, String name){
        say ();
        System.out.println (a+""+name );// Non-static method (hello) ko call karne ke liye object banaya
        methods n=new methods ();
        n.hello ();

    }
    public static int sumNumb(int a,int b){
        return a+b;
    }
    public static void  say(){
        System.out.println ("hello" );
    }

    public static void main(String[] args) {
        methods scs=new methods ();
        scs.hello ();
        sum (10,"Abhishek");
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a two number" );
        int a= sc.nextInt ( );
        int b=sc.nextInt ();
        System.out.println (sumNumb (a,b) );
    }
}
