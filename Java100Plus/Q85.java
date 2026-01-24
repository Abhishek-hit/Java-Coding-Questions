package Java100Plus;

public class Q85 {
    public static void main(String[] args) {
        int[] input={5, 2, 8, 1, 4};

        for (int i=0;i<input.length;i++){
            for (int j=i+1;j<input.length;j++){
                if (input[i]>input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;

                }
            } System.out.print(input[i] );
        }
    }
}
