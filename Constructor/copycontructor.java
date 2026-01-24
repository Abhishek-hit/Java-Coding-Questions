package Constructor;


class copy{
    int a;
    String name;
    copy(){
        a=10;
        name="abhishek";
        System.out.println (a+" "+name );

    }
    copy(copy ref){
        a= ref.a;
        name=ref.name;
        System.out.println ("this for second consturctor:- "+a+" "+name );

    }
}
public class copycontructor {
    public static void main(String[] args) {
        copy r=new copy ();
        copy r1=new copy (r);
    }
}
