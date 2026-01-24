package Constructor;


class n{
    int a;
    String name;
   private n(){
        a=10;
        name="Abhishek";
       System.out.println (a+" "+name );
    }
    public static void main(String[] args) {
        n ref=new n ();
    }
}
