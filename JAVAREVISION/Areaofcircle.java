package JAVAREVISION;

import java.awt.geom.Area;
import java.util.Scanner;

public class Areaofcircle {
    public static  double AreaOfCircle(int num) {
        double Area;
        if (num > 0) {
            Area = 3.14 * num * num;
        } else{
//            System.out.println ("value is negative"+num );
            return -1;

        }

//        System.out.println (Area );
//        return 1;
        return Area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vale of circle for area");
        int r=sc.nextInt ();
//        AreaOfCircle (5);
        double result=  AreaOfCircle (r);
        System.out.println (result );
//        System.out.println (Area);

//        Double AreaOfCircle=3.14*r*r;
//        System.out.println("area of circle "+AreaOfCircle);
    }
}
