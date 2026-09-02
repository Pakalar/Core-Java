package oops.encapsulation.polymorphism;

class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}

public class MethodOverloading{
    public static void main(String[] args){
        Calculator calculator
                =new Calculator();

        calculator.add(10,20);
        calculator.add(10,20,30);
        calculator.add(10.33,20.34);
    }
}
