package Java8;

public class addtwonumber {
    interface  num{
        int add(int a, int b);
    }
    public static void main(String[] args) {
        num adds=(x,y)-> x+y;
        System.out.println (adds.add (52,56) );

    }
}
