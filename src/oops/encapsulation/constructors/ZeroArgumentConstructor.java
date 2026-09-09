package oops.encapsulation.constructors;

class Student{

    private String name="abc";
    private int age;

    //Zero Argument Constructor- Provided bu Programmer
    public Student(){

    }

    public void display(){
        System.out.println(STR."Student name is:\{name} and Student age is :\{age}");
    }
}
public class ZeroArgumentConstructor {
    public static void main(String[] args){

        Student std=new Student();
        std.display();
    }
}
