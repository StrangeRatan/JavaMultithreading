package ThreadMethod;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1(); 
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
    
}
