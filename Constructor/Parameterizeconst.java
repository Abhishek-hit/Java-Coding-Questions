package Constructor;

class Ab{
    int x,y;
    Ab(int a,int b){
        x=a;y=b;
    }
    void show(){
        System.out.println (x+" ,"+y );
    }
}
public class Parameterizeconst {
    public static void main(String[] args) {
        Ab ref=new Ab (5,5);
        ref.show ();

    }
}
