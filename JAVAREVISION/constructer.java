package JAVAREVISION;

public class constructer {
    public static class  Student{
        int  age;
        String name;
        int roll;
        int marks;
        Student(int age,String name,int roll, int marks){
            this.age=age;
            this.name=name;
            this.roll=roll;
            this.marks=marks;
            System.out.println (age+" "+name+" "+roll+" "+marks );
        }
//getter stter
        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void  data(Student newname){
           newname.name=this.name;
        }
    }
    public static void main(String[] args) {
        Student student=new Student (12,"abhsihek",12,78);
        student.setAge (10);
        System.out.println (student.getAge () );
      student.data (student);




    }
}
