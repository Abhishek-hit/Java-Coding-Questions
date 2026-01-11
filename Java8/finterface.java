package Java8;

interface myinterface{
    void greet(String name);


    default void show(){
        System.out.println ("hello" );
    }
    static void info(){
        System.out.println ("jay" );
    }
}

interface table{
 void num(int a);
}
public class finterface {
    public static void main(String[] args) {

        myinterface myinterfaces=n-> System.out.println ("hello "+n );
        myinterfaces.greet ("Abhishek");
        myinterface.info ();
        myinterfaces.show ();
        table t=(data)->{
            for (int i=1; i<=10;i++){
                System.out.println (i*data );
            }
        };
    t.num (10);

    }

}
