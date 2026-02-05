package Java100Plus;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("1 se 100 tak ke Prime Numbers:");

        // Bahar wala loop 2 se 100 tak har number ko check karega
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Andar wala loop check karega ki 'num' kisi se divide hota hai ya nahi
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Factor mil gaya, toh prime nahi hai
                    break;
                }
            }

            // Agar loop khatam hone ke baad bhi isPrime true hai, toh print karo
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
