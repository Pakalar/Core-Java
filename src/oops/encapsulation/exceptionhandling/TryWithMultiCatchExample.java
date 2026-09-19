package oops.encapsulation.exceptionhandling;

public class TryWithMultiCatchExample {
    public static void main(String[] args){
        int array[]={1,2,3,4,5};
        int divisor=0;
        try{
            int result=array[7]/divisor;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured");
        }catch (ArithmeticException e){
            System.out.println("Divide by zero is not allowed");
        }catch(Exception e){
            System.out.println("Some exception occured"+e.getMessage());
        }
    }
}
