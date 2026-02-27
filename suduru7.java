abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }


    abstract double calculateFinalAmount();

    @Override
    public String toString() {
        return "Original Amount: ₹" + amount +
               "\nFinal Amount: ₹" + calculateFinalAmount();
    }
}


class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        double fee = amount * 0.02;

        if (amount > 50000) {
            fee += 500;
        }

        return amount + fee;
    }
}


class UpiPayment extends Payment {

    UpiPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        if (amount > 100000) {
            return amount - (amount * 0.01);
        }
        return amount;
    }
}


class CryptoPayment extends Payment {

    CryptoPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        return amount + (amount * 0.05);
    }
}


public class suduru7 {

    public static void main(String[] args) {

        Payment[] payments = new Payment[3];

        payments[0] = new CreditCardPayment(60000);
        payments[1] = new UpiPayment(150000);
        payments[2] = new CryptoPayment(40000);

        for (Payment p : payments) {
            System.out.println("------");
            System.out.println(p);  
        }
    }
}


