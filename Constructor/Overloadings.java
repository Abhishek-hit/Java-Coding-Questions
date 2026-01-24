package Constructor;

class math{
    math(){
        int a=10;
        System.out.println (a );
    }
    math(int x){
        System.out.println ("x is "+ x );
    }
    math(String name){
        System.out.println ("name is "+name );
    }
}
public class Overloadings {
    public static void main(String[] args) {
        math r=new math ();
        math r1=new math ( 10 );
        math r2=new math ( "abhishek" );

    }
}
