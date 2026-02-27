public class suduru3 {
    int[][][] marks = {
        {{80,85},{90,95}},
        {{90,95},{80,85}}
    };
    void analysis(){
        for (int c = 0; c<marks.length;c++){
            for (int s = 0;s<marks[c].length;s++){
                int total = 0;
                for (int sub = 0;sub<marks[c][s].length;sub++){
                    total+=marks[c][s][sub];
                }
            System.out.println("Class" +c+ "Student" +s+ "total" +total);
            }
        }
    }
    public static void main(String[] args) {
        new suduru3().analysis();
    }
}
