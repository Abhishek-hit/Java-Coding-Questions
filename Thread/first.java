package Thread;

public class first extends Thread {
    public void run(){
        System.out.println ("thread is runnig" );
    }
    public static void main(String[] args) {
        first th=new first ();
        th.start ();
        th.run ();


    }
}
