package Java100Plus;

public class Q86 {
    public static void main(String[] args) {
        int [] arr={5, 2, 8, 1, 4};
        int max=arr[0];
        for (int i=1;i< arr.length;i++){

            if (arr[i] < max) {
                max = arr[i]; // toh max ko update kar dein
            }

        } System.out.println (max );
    }
}
