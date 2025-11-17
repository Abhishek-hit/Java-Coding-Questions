package Java100Plus;

import java.util.Stack;

public class reversr {

    public static String reversString(String str){
        Stack<Character> stack=new Stack<> ();
        for (char c:str.toCharArray ()){
            stack.push (c);
        }
        String rev="";
        while (!stack.isEmpty ()){
            rev+=stack.pop ();
        }

        return  rev;
    }

    public static void main(String[] args) {
        System.out.println (  reversString ("hello") );
        String n="acdfdlkjkd";




    }
}
