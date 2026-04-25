package duke.choice;
public class Customer {
    private String name;
    private String size;

    private Clothing[] items;

    public Customer(String name , int mesaurment){
        this.name = name;
        setsize(mesaurment);
    }

    public void addItems(Clothing[] someItems){
        items = someItems;
    }

    public Clothing[] getItems(){
        return items;
    }

    public double getTotalClothingCost(){
        double total = 0.0;
        for (Clothing item : items) {
           // if (c1.getsize().equals(item.getSizee())) {
                total = total + item.getprice();
              //  System.out.println("Item: " + item.getnameee() + ", " + item.getprice() + ", " + item.getSizee());

               // total = total + (total * tax);

               // if (total > 15) { break; }
            //}
        }
        return total;
    }

    public String getname(){
        return name;
    }

  /*  public void setname(String name){
        this.name = name;
    } */

    public String getsize(){
        return size;
    }

    public void setsize(String size){
        this.size = size;
    }

    public void setsize(int mesaurment){
        switch (mesaurment) {
            case 1, 2, 3:
                size = "S";
                break;
            case 4, 5, 6:
                size = "M";
                break;
            case 7, 8, 9:
                size = "L";
                break;
            default:
                size = "X";
        }
    }

}
