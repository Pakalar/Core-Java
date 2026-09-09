package oops.encapsulation.constructors;

class Car{
    //Default Constructor
    private String brand;
    private int speed;

    public void display(){
        System.out.println(STR."The speed of the car is :\{speed}");

    }
}
public class DefaultConstructorsExample {
    public static void main(String[] args){
        Car car1=new Car();
        car1.display();
    }
}
