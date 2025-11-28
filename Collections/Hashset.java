package Collections;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> list=new HashSet<> ();//insertion order not maintain
        list.add ("hello");
        list.add ("how");
        list.add ("are");
        list.add ("hello");//duplicate not allowed it will remove if any e is duplicate

        System.out.println (list );
        //also we can use Iterator and for each like others which we have done
    }
}
