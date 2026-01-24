package Constructor;

class D{
    int a;String name;
    D(int x,String data){
        this.a=x;
        this.name=data;
        System.out.println (a+" "+name );

    }
}
public class usethis {
    public static void main(String[] args) {
      D r=new D (10,"Abhi") ;
    }
}
