package Constructor;

class Abhi{
    int a;
    String name;
    Abhi(){
        a=20;
        name="Abhishek";
    }
    void ref(){
        System.out.println (a+" "+name );
    }
}

public class defaultconst {
    public static void main(String[] args) {
        Abhi Ref=new Abhi ();
        Ref.ref ();

    }
}
