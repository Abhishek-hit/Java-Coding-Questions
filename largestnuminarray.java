public class largestnuminarray {
    public static void main(String[] args) {
        int arr[] ={5,15,1,86,23,45,25};
        int max = arr[0];
        for (int i=1;i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println ("print max " +max );

    }
}
