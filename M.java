public class M {
    public static void main(String[] args) {
        int a = 1 , b = 0;
        try {
            int c = a/b;
            System.out.println("the answer : "+ c);
        } catch (ArithmeticException e) {
            System.out.println("correct value enter chei ra pooka");
        }
    }
}
