package Constructor;


class Main{
    Main(){
        System.out.println ("this is main constructor" );
    }
    {
        System.out.println ("this is intance block" );
    }
  static   {// this block is run first if all the block is present. if only instance is there then it will run first
        System.out.println ("this is static block" );
    }
}
public class instanceblock {
    public static void main(String[] args) {
        Main r=new Main ();

    }
}
