class Task implements Runnable {
    int num, denom;
    Task(int n, int d) {
        num = n;
        denom = d;
    }
    public void run() {
        try {
            int result = num / denom;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in thread");
        }
    }
}

public class Newfile {
    public static void main(String[] args){
        Task t1 = new Task(10, 0);
        t1.run();
    }
}