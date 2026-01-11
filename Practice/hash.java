package Practice;

import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args){
        Map<String,Integer> data=new HashMap<> ();
        data.put ("abhishek",25);
        data.put ("Satyam",26);
        data.put("dilip",80);
        data.put("mohit",50);
        System.out.println (data);
        System.out.println(data.get ("dilip"));
        System.out.println(data.get ("mohit"));
        System.out.println(data.containsKey ("dilip"));
        System.out.println(data.containsValue (50));
        System.out.println(data.isEmpty ());
        System.out.println(data.size ());

//        contains ke liye
        String names="abhi";
        if (data.containsKey (names)){
            System.out.println (names+"is avialable" );
        }else
            System.out.println ("not avialable" );

//        contains values
        Integer vales=50;
        if (data.containsValue (vales)){
            System.out.println (vales+"is avialable" );
        }else
            System.out.println ("not avialable" );

        // default ka use krna
        int def=data.getOrDefault ("ram",0);
        System.out.println (def );

        //loop ke liye
        for (String k:data.keySet ()){
            System.out.println ("all the key :- "+k );
        }
        for (Integer V:data.values ()){
            System.out.println ("all values "+V );
        }

        //entry set ke liye
        for (Map.Entry<String,Integer> entry:data.entrySet ()){
            String Names=entry.getKey ();
            int values=entry.getValue ();
            System.out.println (Names+"->"+values );
        }
    }
    }



