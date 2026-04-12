class ThrowsExample {
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Handled in main");
        }
    }
}