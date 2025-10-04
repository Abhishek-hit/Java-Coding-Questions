public class oddandeven {
    static void ov(int arr[]){
        int n=arr.length;
        for (int i=0; i<n;i++){
            if (arr[i]%2==0){
                System.out.print(" "+arr[i] );
            }

        }


    }
    public static void main(String[] args) {
        int arr[]={15,2,4,9,16,17,21,14,};
       oddandeven.ov (arr);

    }
}
