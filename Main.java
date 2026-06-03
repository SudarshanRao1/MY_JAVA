
class Product {
    int Productid;
    String name;
    int price;
    String category;

    Product(int p , String n , String c , int price){
        this.Productid = p;
        this.name = n;
        this.category = c;
        this.price = price;
    }

    void Displayall(){
            System.out.println("product " + Productid);
            System.out.println("name  "  + name);
            System.out.println("price " + price);
            System.out.println("catogary " + category);
    }
  
}

public class Main{
    public static void main(String[] args) {
        Product[] p = new Product[5];
        p[0] = new Product(5005 , "lays" , "eating" , 20);
        p[1] = new Product(1000, "mouse" ,  "Electronics", 10000);
        p[2] = new Product(500 , "midha" , "eating" , 200);
        p[3] = new Product(5000 , "pencil" , "School" , 2000);
        p[4] = new Product(50054515 , "charger" , "Electronics" , 20000);

        for(Product a : p){
            if (a.Productid == 5005){
                a.Displayall();
            }
        }

        for (Product a : p){
            if (a.category.equals("Electronics") && a.price >= 10000){
                a.Displayall();
            }
        }

    }
}
