package Collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreesSets {
    public static void main(String[] args) {
        TreeSet<Integer> str=new TreeSet<> (Collections.reverseOrder ());// without collections it will give us sorted
        //answer

        str.add (52);
        str.add (5);
        str.add (51);
        System.out.println (str );
    }
}
