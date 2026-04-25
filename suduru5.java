public class suduru5 {

    int bookid;
    String title;
    int avil;

    suduru5(int i, String t, int a) {

        if (i <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }

        if (t == null || t.isEmpty()) {
            throw new IllegalArgumentException("Invalid title");
        }

        bookid = i;
        title = t;
        avil = a;
    }
}

class test15 {
    public static void main(String[] args) {
        suduru5 s = new suduru5(102,"java",5);
        suduru5 s1 = new suduru5(103,"",5);
        suduru5 s2 = new suduru5(0,"javaaa",5);

    }
}