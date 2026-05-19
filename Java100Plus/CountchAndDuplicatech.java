package Java100Plus;

public class CountchAndDuplicatech {
    public static void main(String[] args) {
        String str="programming hello hello are you";
//        char[] chars=str.toCharArray ();
        String[] chars=str.split (" ");

       boolean[] visited=new boolean[chars.length];
        for (int i=0;i<chars.length;i++){
            if (visited[i]){
                continue;
            }
            String currentChar=chars[i];
            int count=1;

            for (int j=i+1; j<chars.length; j++){

              //  if (currentChar == chars[j]) for char ke liye
                if (currentChar.equals(chars[j])){
                    count++;
                    visited[j] = true; //duplicate milta h use visited kro
                }

            }
//         System.out.println(chars[i] + " ki count: " +count);//total chr kitni bar aur
//            ye count
            if (count>1){
                System.out.println( "Duplicate "+chars[i]+" counts-> "+count );
            }
        }
    }
}
