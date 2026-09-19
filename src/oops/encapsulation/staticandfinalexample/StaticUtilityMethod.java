package oops.encapsulation.staticandfinalexample;


//static methods mainly used for creating utility methods
class MathHelper{

    public  static int square(int number){
        return number*number;
    }

    public static int cube(int number){
        return number*number*number;
    }
}

public class StaticUtilityMethod {
    public static void main(String[] args){
        System.out.println(MathHelper.square(2));
        System.out.println(MathHelper.cube(5));
    }
}
