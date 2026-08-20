package JAVAREVISION;

import java.util.Scanner;

public class Volumeofshere {
    public static double sphere(int l,int b,int h){
        double result=2*(l*b+b*h+l*h);
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
        System.out.println (sphere (l,b,h) );

    }
}
