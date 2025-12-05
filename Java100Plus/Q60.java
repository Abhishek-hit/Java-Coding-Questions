package Java100Plus;

public class Q60 {
    public static void main(String[] args) {
        String str1="Hello",str2="World";
        str1=str1+str2;
        str2=str1.substring (0,str1.length ()-str2.length ());
        System.out.println("After Step 2: str2 = \"" + str2 + "\"");
        str1=str1.substring (str2.length ());
        System.out.println("After Step 3: str1 = \"" + str1 + "\"");
        System.out.println("\n--- Final Output ---");
        System.out.println("str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
    }
}
