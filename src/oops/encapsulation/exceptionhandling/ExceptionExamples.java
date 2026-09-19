package oops.encapsulation.exceptionhandling;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
//compile time exception
class FileProcessor{

    private static String fileName="secret.txt";

    public void processFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Processing file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("Unable to close the file");
            System.out.println(e.getMessage());
        }
    }
}

//runtime exception
class DivideByZero {
    int num = 10;
    int divisor = 0;

    public void calculate() {
        try {
            int result = num / divisor;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

public class ExceptionExamples {
    public static void main(String[] args) {
        FileProcessor fileprocessor = new FileProcessor();
        fileprocessor.processFile();

        DivideByZero divideByZero = new DivideByZero();
        divideByZero.calculate();
    }
}
