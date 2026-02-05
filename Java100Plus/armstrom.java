package Java100Plus;

public class armstrom {
    public static void main(String[] args) {
        int  rem;

        for (int i = 1; i <= 1000; i++) {
            int sum = 0;      // Har naye 'i' ke liye sum zero se shuru hoga
            int num = i;
            while (num > 0) {
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;

            }
            if (sum == i) {
                System.out.println ("number is arms " + i);
            }
        }

    }}
