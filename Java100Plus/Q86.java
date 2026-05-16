package Java100Plus;

public class Q86 {
    public static void main(String[] args) {
        int [] arr={5, 2, 8, 1, 4};
        int max=arr[0];
        int maxindex=0;
        for (int i=1;i< arr.length;i++){

            if (arr[i] > max) { // min ke lie < kr denge only

                max = arr[i]; // toh max ko update kar dein
                maxindex=i;
            }


        } System.out.println (max+ " index "+maxindex);
        System.out.println (maxindex );
    }
}
