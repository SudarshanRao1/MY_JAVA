public class suduru4 {

    int[][][] hospital = {
        {
            {30,45,20},
            {45,10,35},
            {50,25,10}
        },
        {
            {35,45,25},
            {15,25,35},
            {45,45,45}
        }
    };

    public static void main(String[] args) {
        new suduru4().run();
    }

    void run() {

        int max = hospital[0][0][0];
        int maxW = 0, maxD = 0, maxT = 0;

        boolean hospitalOverloaded = false;

        for (int w = 0; w < hospital.length; w++) {

            boolean wardOverloaded = false;

            for (int d = 0; d < hospital[w].length; d++) {

                int sum = 0;
                int count = 0;

                for (int t = 0; t < hospital[w][d].length; t++) {

                    int value = hospital[w][d][t];

                    sum += value;
                    count++;

                    if (value >= 45) {
                        wardOverloaded = true;
                        hospitalOverloaded = true;
                    }

                    if (value > max) {
                        max = value;
                        maxW = w;
                        maxD = d;
                        maxT = t;
                    }
                }

                double avg = (double) sum / count;

                if (avg > 40) {
                    System.out.println("Day " + d + " is critical in Ward " + w);
                }
            }

            System.out.println("Ward " + w + " overloaded = " + wardOverloaded);
        }

        if (hospitalOverloaded) {
            System.out.println("Hospital is under stress");
        }

        System.out.println("Maximum occupancy " + max +
                " at Ward " + maxW +
                ", Day " + maxD +
                ", Time " + maxT);
    }
}