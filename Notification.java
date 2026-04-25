abstract class Notification {
abstract void send();
}
class Email extends Notification {
void send() {
System.out.println("Sending Email");
}
}
class SMS extends Notification {
void send() {
System.out.println("Sending SMS");
}
}class Push extends Notification {
void send() {
System.out.println("Sending Push Notification");
}
}
public class Notification {
    public static void main(String[] args){
        Sms s1 = new Sms();
        s1.send();
    }
}
