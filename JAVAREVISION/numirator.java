package JAVAREVISION;

public class numirator {
    public static class Fraction{
        int num;
        int den;
        Fraction( int num,int den){
            this.num=num;
            this.den=den;
        }
        void print(){
            System.out.println (num+"/"+den );
        }
        void  add(Fraction f){
            num+=f.num;
            den+=f.den;
        }
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction (3,7);
        f1.print ();
        Fraction f2=new Fraction (7,3);
        f1.add (f2);
        f2.print ();

    }
}
