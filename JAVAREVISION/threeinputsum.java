package JAVAREVISION;

import java.util.Scanner;

public class threeinputsum {
    public static double sum(int l,int b,int h){
        double result=(l+b+h);
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a lenght of sphere");
        int l=sc.nextInt ();
        System.out.println("enter a brigth of sphere");
        int b=sc.nextInt ();
        System.out.println("enter a hight of sphere");
        int h=sc.nextInt ();
//        double AreaOfSphere=sphere (l,b,h);
//        System.out.println (AreaOfSphere );
        System.out.println (sum (l,b,h) );
    }
}
