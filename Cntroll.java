public class Cntroll extends Thread {
    private Pet myPet;

    public Cntroll(Pet pet) {
        this.myPet = pet;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(2000); // Wait 2 seconds
                myPet.decreaseHunger(5);
                System.out.println("Hunger decreased...");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}