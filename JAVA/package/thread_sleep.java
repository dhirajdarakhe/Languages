
class Mythread extends Thread {
    public Mythread(String Thread_name) {
        super(Thread_name);
    }

    public void run(){
        int count  = 5;
        while(count>0){
            System.out.println(count--);
            try{Thread.sleep(1000);}
            catch(InterruptedException e)
            {System.out.println(e);}
        }
    }

}

public class thread_sleep {
    public static void main(String[] a) {
        Mythread t = new Mythread("Dhiraj");
        System.out.println("my thread name " + t.getName());
        System.out.println("is this thread alive "+t.isAlive());
        t.start();
        System.out.println("is this thread alive "+t.isAlive());

    }
}
