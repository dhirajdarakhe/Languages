import java.util.Scanner;

// class Mythread extends Thread {
//     public Mythread(String Thread_name) {
//         super(Thread_name);
//     }

//     public void run(){
//         System.out.println("Begin ");
//         try{Thread.sleep(1000);}
//         catch(InterruptedException e){}
//         System.out.println("End ");

//     }

// }

public class thread_join {
    public static void main(String[] a) {
        // Mythread t1 = new Mythread("Dhiraj");
        // Mythread t2 = new Mythread("Darakhe");
        // t1.start();
        // try{t1.join();}
        // catch(Exception e){}
        // System.out.println("hi dhiraj");
        // t2.start();
        // System.out.println("bye dhiraj");
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        System.out.println(a1);
    }
}
