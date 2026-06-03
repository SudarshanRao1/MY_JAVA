public class Arrayy {
    int[][] sales = {
        {10 , 20 , 30 , 40} , 
        {8 , 9 , 10 , 11},
        {12 , 13 , 14 , 15}
    };

    void compute(){
        int sum = 0 ;
        for (int i = 0 ; i < sales.length ; i++){
            for (int j = 0; j < sales[i].length ; j++){
                sum += sales[i][j];
            }           
            System.out.println("product "+ i +" total sales = " + sum);
        }   
    }

    public static void main(String[] args) {
        new Arrayy().compute();
    }
}
