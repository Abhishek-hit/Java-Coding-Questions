package Pattern;

public class Q1 {
    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<=7;i++){
            for (int j=1; j<=n-i+1;j++){
                System.out.print(" "+j );
            }
            System.out.println ( );
        }

    }
}
