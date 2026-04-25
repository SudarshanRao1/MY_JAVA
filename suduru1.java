public class suduru1{
    int[][] height = {
        {170,171,172},
        {160,161,162},
        {150,151,152}
    };

    void Main(){
        int sum =0;
        int count = 0;
        int max = height[0][0];

        for (int i = 0; i<height.length;i++){
            for (int j = 0; j<height[i].length;j++){
                sum+=height[i][j];
                count++;
                if(height[i][j]>max){
                    max = height[i][j];
                }
            }

            }
            System.out.println("the max height = " +max);
            System.out.println("the average height = " +(double)sum/count);
        }
        public static void main(String[] args) {
            new suduru1().Main();
        }
    }

