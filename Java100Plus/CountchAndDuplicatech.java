package Java100Plus;

public class CountchAndDuplicatech {
    public static void main(String[] args) {
        String str="programming";
        char[] chars=str.toCharArray ();

       boolean[] visited=new boolean[chars.length];
        for (int i=0;i<chars.length;i++){
            if (visited[i]){
                continue;
            }
            char currentChar=chars[i];
            int count=1;

            for (int j=i+1; j<chars.length; j++){

                if (currentChar == chars[j]){
                    count++;
                    visited[j] = true; //duplicate milta h use visited kro
                }

            }
           System.out.println (chars[i] + " ki count: " + count);//total chr kitni bar aur
            //ye count
//            if (count>1){
//                System.out.println( "Duplicate "+chars[i]+" count-> "+count );
//            }
        }
    }
}
