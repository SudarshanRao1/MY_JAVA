public class Hospital{
    int[][][] occupancy = {
        {{23,52},{45,30}},
        {{23,20},{30,34}}
    };    
    void logic(){
        boolean overloaded = false;
        boolean understress = false;
        int a = 0;
        int b = 0;
        int c = 0;
        int maximum = occupancy[0][0][0];
        for(int wards = 0; wards<occupancy.length ; wards++){
            for(int days = 0;days<occupancy[wards].length;days++){
                int sum = 0;
                for(int timeslot = 0;timeslot<occupancy[wards][days].length;timeslot++){
                     sum+=occupancy[wards][days][timeslot];                    
                    if(occupancy[wards][days][timeslot]>=45){
                        overloaded = true;
                        System.out.println("ward " + wards + " overloaded = " + overloaded);     
                    } 
                    if(occupancy[wards][days][timeslot]>maximum){
                        maximum = occupancy[wards][days][timeslot];
                        a = wards;
                        b = days;
                        c = timeslot;
                    }                   
                }
                double avg = sum/(double) occupancy[wards][days].length;
                if(avg > 40){
                    understress = true;
                }
            }
        }
        if(understress==true){
            System.out.println("Hospital under stress = " + understress);
        }
        System.out.println("Maximum occupancy = "+ maximum + " Wards " + a + " days = " + b + " Time = " + c);
    }

    public static void main(String[] args) {
        new Hospital().logic();
    }
}
