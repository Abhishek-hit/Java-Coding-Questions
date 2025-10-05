public class charcount {
    public static void main(String[] args) {
        String ch="hello my dear frieds";
        int count=1;
        for (int i=0;i<ch.length ();i++){
            if ((ch.charAt(i) == ' ') && (ch.charAt(i + 1) != ' ')){
                count++;
            }

        }
        System.out.println (count );
    }
}
