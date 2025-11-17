package JavaR;

interface Dog{
    void run();
    void call();
}
 class imp implements Dog{
    @Override
    public void run() {
        System.out.println ("hello" );
    }

    @Override
    public void call() {
        System.out.println ("how" );
    }
}
public class interfacename {
    public static void main(String[] args) {
        imp d=new imp ();
        d.call ();
        d.run ();

    }
}
