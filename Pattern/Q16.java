package Pattern;

public class Q16 {
    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print (" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print (j);
            }
            System.out.println ( );
        }
        int m=7;
        for (int i=1;i<m;i++){
            for (int j=1; j<=n-i-1;j++){
                System.out.print (" ");
            }
            for (int j=n-i;j<=n;j++){
                System.out.print (j );
            }
            System.out.println ( );

        }
    }
}
