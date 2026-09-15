package JavaClassesMagnus;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student1 implements  Comparable<Student1>{
    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student1 student) {
        return this.id-student.id;
    }
    public static void main(String[] args) {
        Student1 s = new Student1(1,"A");
        Student1 s1 = new Student1(9,"A");
        Student1 s2 = new Student1(4,"A");
        Student1 s3 = new Student1(3,"A");

        List<Student1> ls = new ArrayList<>();
        ls.add(s);
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);

        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
    }

    @Override
    public String toString() {
        return STR."Student{id=\{id}, name='\{name}'}";
    }

   // @Override
    //public int compareTo(Student o) {
       // return 0;
    //}
}
