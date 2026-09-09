package JavaClassesMagnus;

public class Student {

    /*Scanner input = new Scanner(System.in);

    String name="Manasa";
    int age=25;
    String studentId="26321763";

    public void displayStudentdetails(){

        //System.out.println("Enter student Name:");
        //System.out.println("Enter student Age:");
        //System.out.println("Enter student Id:");

        //String name=input.next();
        System.out.println(STR."Student name is:\{name}");


        //String age=input.next();
        System.out.println(STR."Student age is:\{age}");


        //String studentId=input.next();
        System.out.println(STR."Student Id is :\{studentId}");
    }*/

    //OR

    private String name;
    private int age;
    private String Id;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public void getName() {
        System.out.println(STR."name is :\{name}");
       // return name;
    }
}





