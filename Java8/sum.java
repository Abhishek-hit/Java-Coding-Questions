package Java8;

public class sum {
    interface myInterface{
        int add(int a);
    }
    public static void main(String[] args) {
        myInterface Myinterface=(a)->{
            int total=0;
            for (int i=0;i<a;i++){
                total=total+i;
            }
            return total;
        };
        System.out.println (Myinterface.add(10) );
        int result = Myinterface.add (5);
        System.out.println("Sum of 5 is: " + result);
    }
}
