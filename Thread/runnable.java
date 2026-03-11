package Thread;

public class runnable implements Runnable{
    public void run() {
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
      runnable obj = new runnable ();

        Thread t1 = new Thread(obj);
        t1.start();
    }
}
