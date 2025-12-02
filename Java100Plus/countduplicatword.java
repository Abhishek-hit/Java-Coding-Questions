package Java100Plus;

public class countduplicatword {
    public static void main(String[] args) {
        String str = "java is fun and java is easy";
        String[] s = str.split(" ");

        boolean[] b = new boolean[s.length]; // Visited array

        for (int i = 0; i < s.length; i++) {

            // Agar ye word pehle count ho chuka h, to skip kro
            if (b[i]) {
                continue;
            }

            String chrcount = s[i];
            int count = 1; //  Count hamesha 1 se shuru hoga

            for (int j = i + 1; j < s.length; j++) {

                // Sudhaar 2: String compare karne ke liye .equals() use karein
                if (chrcount.equals(s[j])) {
                    count++;
                    b[j] = true; // Mark as visited
                }
            }

            // Agar aapko sirf Duplicate chahiye (count > 1), to if laga de
            if(count > 1) {
                System.out.println(s[i] + " ki count: " + count);
            }

            // Agar sabki frequency chahiye to ye line use kare:
            // System.out.println(s[i] + " ki count: " + count);
        }
    }
}