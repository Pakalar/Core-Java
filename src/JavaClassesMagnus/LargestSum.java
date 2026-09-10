package JavaClassesMagnus;

import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
        //int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number (a):");
        System.out.print("Enter number (b):");
        System.out.print("Enter number (c):");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int sum1=a+b;
        int sum2=b+c;
        int sum3=a+c;

        if(sum1>sum2){
            System.out.println(STR."Larger number is Sum1:\{sum1}");
        }
        else if(sum2>sum3){
            System.out.println(STR."Largest number is Sum2:\{sum2}");
        }
        else{
            System.out.println(STR."Largest Number is Sum3:\{sum3}");
        }

    }
}
