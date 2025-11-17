package JavaR;
abstract class  Animal{  //yaha is liye likha kiu ki global accessable ho ga
  abstract void hello ();
  abstract void names();
}
class Name extends Animal{

    void hello(){
        System.out.println ("hello" );
    }
    void names(){
        System.out.println ("name" );
    }
}

public class abs {
    public static void main(String[] args) {
   Name o=new Name ();
   o.hello ();
o.names ();

    }
}

