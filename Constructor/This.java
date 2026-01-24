package Constructor;


class C{
    void show(){
        System.out.println (this );
    }
}
public class This {
    public static void main(String[] args) {
        C r=new C ();
        r.show ();
    }
}
