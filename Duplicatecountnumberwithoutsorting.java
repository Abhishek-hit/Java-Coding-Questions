public class Duplicatecountnumberwithoutsorting {
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 2, 4, 1, 5, 2};
            int n = arr.length;

            // Outer loop for each element
            for (int i = 0; i < n; i++) {
                int count = 1; // current element count

                // Agar element -1 ho gaya, matlab already visited
                if (arr[i] == -1)
                    continue;

                // Inner loop to compare with next elements
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }

                // Agar element 1 se zyada baar aya, to print karo
                if (count > 1)
                    System.out.println(arr[i] + " → " + count + " times");
            }
        }
    }

