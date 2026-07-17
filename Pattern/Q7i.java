package Pattern;

public class Q7i {
    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<=n;i++){
            for (int j=i;j>=1;j--){
                System.out.print ("  *"+ j );
            }
            System.out.println ( );
        }
    }
}
