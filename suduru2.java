public class suduru2{
    int[][][] temp = {
        {{10,20},{30,40}},
        {{50,60},{70,80}}
    };
    void temprature(){
        for (int room = 0; room<temp.length;room++){
            int sum = 0;
            int count = 0;
            for (int day = 0;day<temp[room].length;day++){
                for (int read = 0; read<temp[room][day].length;read++){
                    sum+=temp[room][day][read];
                    count++;

                }
            }
         System.out.println("Room " + room + " average = " + (double) sum / count);
        }

    }
    public static void main(String[] args) {
        new suduru2().temprature();
    }
}
