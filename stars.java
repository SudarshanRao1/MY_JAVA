class stars {
    int[] arr;


    stars(int[] inputArr) {
        this.arr = inputArr;
    }

    void logic() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }
    }

    public static void main(String[] args) {

        stars s1 = new stars(new int[]{2, 4, 1, 10, 3});
        s1.logic();
    }
}
