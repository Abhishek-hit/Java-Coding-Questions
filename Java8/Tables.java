package Java8;

public class Tables {
    interface Table{
        int cal(int a);
    }
    public static void main(String[] args) {
        Table data=(n)->{
            for (int i=1;i<=10;i++){
                int result=i*n;
                System.out.println (n+"* "+i+"= "+ result );
            }
            return n;
        };
        data.cal (5);

    }
}
