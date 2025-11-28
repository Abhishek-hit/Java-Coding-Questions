package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add ("Abhi");
        list.add ("sharma");
        list.add ("name");
        list.add (1,"jay");
        list.set (0,"jay ram");

        System.out.println ("list is Before"+list );
        System.out.println ("size is"+list.size () );
        System.out.println (list.contains ("radhe") );

        //traversing array using foreach
        for (String name:list){
            System.out.println (name );
        }
        //by using Iterators

        Iterator<String> itr= list.iterator ( );
        while (itr.hasNext ()){
            //aise bhi kr skate h
//            String name=itr.next ();
//            System.out.println (name );

            System.out.println ("Iterators :"+itr.next () );//next element pr pr move krta h  and return a value of tha index
        }

        System.out.println ("abhi".equals (list) );//compare ke liye safest way h

        //sort



    }
}
