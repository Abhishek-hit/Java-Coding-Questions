package Pattern;

public class Q10 {
    public static void main(String[] args) {
        int n=7; int m=6;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print (" "+j );
            }
            System.out.println ( );
        }
        for (int i=1;i<=m;i++){
            for (int j=1;j<=i+1;j++){
                System.out.print (" "+j );
            }
            System.out.println ( );
        }
    }
}
