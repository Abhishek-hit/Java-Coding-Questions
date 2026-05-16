package Java100Plus;

public class Q90    {
    public static void main(String[] args) {
        int arr[]={5,2,3,8,7,6};
        int firstmax=arr[0];
        int secondmax=arr[1];
        for (int i=2;i<arr.length;i++){
            if (arr[i]>firstmax&&arr[i]>secondmax){
                firstmax=arr[i];
                secondmax=arr[i];
            }
        }
        System.out.println (firstmax );
    }
}
