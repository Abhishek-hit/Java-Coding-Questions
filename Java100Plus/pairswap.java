package Java100Plus;

public class pairswap {
    public static String swappair(String str){

        char[] data=str.toCharArray ();
        int n= data.length;

        for (int i=0;i<n;i+=2){
            char temp=data[i];
            data[i]=data[i+1];
            data[i+1]=temp;
        }
        return new String ( data );
    }
    public static void main(String[] args) {
        String input="abcdef";
        System.out.println ("output :"+swappair (input) );
    }
}
