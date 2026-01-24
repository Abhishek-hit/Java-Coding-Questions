package Constructor;


class B{
    int a;
    String name;
    B(){ //if we commit this constructor then out put will be same because it will make a default constructor
        a=0;
        name=null;
    }
    void show(){
        System.out.println (a+""+name );
    }
}
public class A {
    public static void main(String[] args) {

        B ref= new B();
        ref.show ();

    }
}
