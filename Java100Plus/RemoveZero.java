package Java100Plus;

public class RemoveZero {

    public static String removeZerosByConversion(String input){
        if (input == null || input.isEmpty()) {
            return input;
        }
        try {
            // String ko Integer mein badlo
            int number=Integer.parseInt (input);

            //wapas int ko string me badala
            return String.valueOf (number);
        }catch (NumberFormatException e) {
            // Agar input valid number nahi hai
            return "Invalid Input or Out of Range";
        }
    }
    public static void main(String[] args) {
        String input = "00070909023";
        System.out.println("Output (Conversion): " + removeZerosByConversion(input));
    }
}
