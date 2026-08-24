package Inheritance;

public class Animal {
    String species;

    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog ia Barking");
    }

}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat is growling");
    }

}

class Runner{
    public static void main(String[] args){

        Animal leo=new Dog();
        Animal jack=new Cat();

        leo.makeSound();
        jack.makeSound();

    }
}
