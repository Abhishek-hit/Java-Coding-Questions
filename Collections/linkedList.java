package Collections;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new  LinkedList<> ();
        list.add ("Abhi");
        list.add ("sharma");
        list.add ("name");
        list.addLast ("satyam");
        System.out.println (list );
        System.out.println (list.getFirst () );

        Iterator<String> itr=list.iterator ();
        while (itr.hasNext ()){
            System.out.println (itr.next () );
        }
        Collections.reverse (list);
        System.out.println ("revers list"+list );

        LinkedList<Integer> ints=new LinkedList<> ();
        Scanner sc=new Scanner (System.in);
        for (int i=0;i<list.size ();i++){
        int d=sc.nextInt ();
        ints.add (d);

        }
        System.out.println (ints );
        System.out.println (ints.removeFirst () );
    }
}
