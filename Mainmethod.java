public class Mainmethod {
    public static void main(String[] args) {
        Pet myDog = new Pet("Buddy", 50);

        Cntroll drain = new Cntroll(myDog);
        drain.start();

        try {
            myDog.eat(60);
        } catch (OverfedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}