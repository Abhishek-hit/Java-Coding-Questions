package Java100Plus;

public class Q84 {
    public static void main(String [] args){
        int [] input={10,20,30,45};
         int target=20;

         for (int i=0;i<input.length;i++){
             if (input[i]==target){
                 System.out.println ("target found " +input[i] + " on index " + i);
                 break;
             }
         }
    }
}
