package duke.choice;
public class Clothing implements Comparable<Clothing>{ // interface - using comaprable interface exrecise - 8.2
    private String nameee;
    private double price;
    private String sizee = "M";
    public final static double MIN_PRICE = 10.0;
    public final static double MIN_TAX = 0.2;

    public Clothing(String nameee , double price , String sizee){
        this.nameee = nameee;
        this.price = price;
        this.sizee = sizee;
    }

    public String getnameee(){
        return nameee;
    }

    public void setnameee(String nameee){
        this.nameee = nameee;
    }

    public double getprice(){
        return price + (price * MIN_TAX);
    }

    public void setPrice(double price){
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSizee(){
        return sizee;
    }

    public void setSizee(String sizee){
        this.sizee = sizee;
    }

    // VIDEO  - 11
    // EXERCISE - 8.1
    @Override
    public String toString(){
        return getnameee() + "," + getSizee() + "," + getprice();
    }

    @Override

    public int compareTo(Clothing c){
        return this.nameee.compareTo(c.nameee);
    }

}
