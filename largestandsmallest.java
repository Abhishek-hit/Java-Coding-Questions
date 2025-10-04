public class largestandsmallest {
    static int largesmall(int arr[]){
        int n=arr.length;
        int min=arr[0];
        int max=arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }

        } System.out.println ("max number "+max );
        for (int i=1;i<n;i++){
             if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 5,56,34, 1};
        int minnum=largesmall (arr);
        System.out.println ("max number is "+minnum );
    }
}
