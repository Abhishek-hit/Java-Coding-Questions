import java.util.Arrays;

public class DuplicateUsingSorting {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 5, 2};
        Arrays.sort(arr); // Step 1: sort array

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(arr[i - 1] + " → " + count + " times");
                }
                count = 1; // reset
            }
        }

        // Last element check
        if (count > 1) {
            System.out.println(arr[arr.length - 1] + " → " + count + " times");
        }
    }
}
