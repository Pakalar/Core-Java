package JavaClassesMagnus;

public class PrintingPattern {

    public void display() {

        int i = 5;
        int j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
