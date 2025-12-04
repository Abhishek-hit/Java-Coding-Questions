package Java100Plus;

public class reverseword53 {

    public String reverseWord(String s){
        String[] word=s.trim ().split ("\\s+");
        StringBuilder result=new StringBuilder ();

        for (String words:word){
            StringBuilder sb=new StringBuilder (words);
            sb.reverse ();
            result.append (sb).append (" ");

        }
        return result.toString ().trim ();
    }
    public static void main(String[] args) {
        String input="java is best";
        reverseword53 strs=new reverseword53 ();
       String P= strs.reverseWord (input);
        System.out.println (P );

    }
}
