package Java100Plus;

public class Q28 {
    public static void main(String[] args) {
        String str="jata";
        StringBuilder s= new StringBuilder(str);
        s.setCharAt (2,'v');
        String result=s.toString ();
        System.out.println (result );


    }
}
