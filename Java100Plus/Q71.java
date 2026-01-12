package Java100Plus;

public class Q71 {
    public static void main(String[] args) {
        String input="suie";
        char[] chars=input.toCharArray ();
        String volwels="aieou";
        boolean found=false;
        for (int i=0;i< chars.length;i++){
            // Check: Agar character vowels string mein hai (index -1 nahi hai)
            if (volwels.indexOf (chars[i])!=-1){
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println("Contains Vowels");
        } else {
            System.out.println("Does not contain vowels");
        }
    }
}
