class Task implements Runnable {
    int num, denom;
    Task(int n, int d) {
        num = n;
        denom = d;
    }
    int divide() throws ArithmeticException {
        if (denom == 0) {
            throw new ArithmeticException("Invalid input");
        }
        return num / denom;
    }
    public void run() {
        try {
            int result = divide();
            System.out.println(Thread.currentThread().getName() + ": " + result);
        } catch (ArithmeticException e) {
            System.out.println(Thread.currentThread().getName() + ": " + e.getMessage());
        }
    }
}

public class ThreadExceptionFinal {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task(10, 2), "T1");Thread t2 = new Thread(new Task(10, 0), "T2");
        Thread t3 = new Thread(new Task(20, 5), "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}