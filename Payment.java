abstract class Paayment {
double amount;
Paayment(double amount) {
this.amount = amount;
}
abstract void pay();
}
class UPI extends Paayment {
String upiId;
UPI(double amount, String upiId) {
super(amount);
this.upiId = upiId;
}
void pay() {
System.out.println("UPI Payment: " + amount + " using " + upiId);
}
}
class CreditCard extends Paayment {
String cardNumber;
CreditCard(double amount, String cardNumber) {
super(amount);
this.cardNumber = cardNumber;
}void pay() {
System.out.println("Card Payment: " + amount + " using " + cardNumber);
}
}

public class Payment{
    public static void main(String[] args) {
        paayment s1 = new UPI(3454.65 , "abcng4512");
        s1.pay();
    }    
}
