package ThreadMethod;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world! ");
        }
    }

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
        MyThread2 t1 = new MyThread2();
        t1.start(); // t1 is user thread
        myThread.start();
        System.out.println("Main Done");
    }
    
}
