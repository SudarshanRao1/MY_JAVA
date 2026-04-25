class MyRunnable implements Runnable {
    String name;
    MyRunnable(String n) {
        name = n;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
        }
    }
}public class MultiThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("T1"));
        Thread t2 = new Thread(new MyRunnable("T2"));
        Thread t3 = new Thread(new MyRunnable("T3"));
        t1.start();
        t2.start();
        t3.start();
    }
}