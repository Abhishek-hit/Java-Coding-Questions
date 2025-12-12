package Java100Plus;

public class Q68 {

    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder stringBuilder=new StringBuilder ();
        for (int i=0;i<str.length ();i++){
            char chars=str.charAt (i);
            if (chars!=charToRemove){
                stringBuilder.append (chars);
            }
        }
        return stringBuilder.toString ();

    }

    public static void main(String[] args) {
        String input = "hello";
        char target = 'l';
        String targ=removeCharacter (input,target);
        System.out.println ("output:\t"+targ );

    }
}
