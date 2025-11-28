package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> str=new HashMap<> ();
        str.put (1,"Hello");
        str.put (2,"my name");
        str.put (3,"is Abhishel");
        System.out.println (str );

        Hashtable<Integer,String> list=new Hashtable<> ();
        list.put (1,"name");
        list.put (2,"abhi");
        list.put (5,"jay");
        System.out.println (list );


    }
}
