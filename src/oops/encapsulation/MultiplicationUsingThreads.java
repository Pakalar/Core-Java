package oops.encapsulation;

class MyThread extends Thread {

    @Override
    public void run() {
        int i;
        int num = 2;
        for (i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }
}
class Thread2 extends Thread{
    public void run(){

        int k;
      int count=3;
      System.out.println("Table 3 is:");
      for(k=1;k<=10;k++){
         int a=k*count;
       //System.out.println(STR."3 *\{k}=\{a}");
       System.out.println(count+STR. " * " +k+ " = " +a);
          //System.out.println(k*3);
      }



    }


}
public class MultiplicationUsingThreads {
    public static void main(String[] args){
        MyThread th=new MyThread();
        th.start();

        Thread2 th3=new Thread2();
        th3.start();



    }
}
