import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int a[] = {30,25,40};
        int b[] = {45,50,55,60,65};
        int length=a.length+ b.length;
        int[] newarray=new int[length];

        for (int i=0;i< a.length;i++){
            newarray[i]=a[i];
        }
        for (int i=0;i< b.length;i++){
            newarray[a.length+i]=newarray[a.length+i]+b[i];
        }
        System.out.println (Arrays.toString (newarray) );
    }
}
