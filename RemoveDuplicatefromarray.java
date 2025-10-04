import java.util.Arrays;

public class RemoveDuplicatefromarray {
    static int remove(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        int ind=1;
        for (int i=1;i<n;i++){
            if (arr[i]!=arr[i-1]){
                arr[ind++]=arr[i];
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 9, 2, 16, 17, 17, 14};
        int newind=remove (arr);
        for (int i=0;i<newind;i++){
            System.out.print (arr[i]+" " );
        }

    }
}
