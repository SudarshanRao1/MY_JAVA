package duke.choice;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Hello welcome to Duke!");
        Customer c1 = new Customer("Pinnnnky", 33);
        double tax = 0.2;
        // c1.name = "Pinky";
        //  c1.setname("Pinky");
        // c1.size = "S";

        Clothing item1 = new Clothing("Blue dress", 2334.44, "M");
        Clothing item2 = new Clothing("Blue t-shirt", 2334.44, "S");

        Clothing[] items = {item1, item2, new Clothing("Fresh dress", 5.0, "S"), new Clothing("Blue t-shirt", 10.5, "S")};

        System.out.println("MIN price: " + Clothing.MIN_PRICE);

/*        item1.nameee = "Blue dress";
        item1.price = 2334.44;
        item1.sizee = "M";
        item2.nameee = "Green dress";
        item2.price = 22334.44;
        item2.sizee = "S";
        items[2].nameee = "Fresh dress";
        items[2].price = 5.0;
        items[2].sizee = "S";
        items[3].nameee = "Blue t-shirt";
        items[3].price = 10.5;
        items[3].sizee = "S"; */


  /*      c1.setsize("S");
        item1.setnameee("Blue dress");
        item1.setPrice(2334.44);
        item1.setSizee("M");
        item2.setnameee("Green dress");
        item2.setPrice(22334.44);
        item2.setSizee("S");
        items[2].setnameee("Fresh dress");
        items[2].setPrice(5.0);
        items[2].setSizee("S");
        items[3].setnameee("Blue t-shirt");
        items[3].setPrice(10.5);
        items[3].setSizee("S"); */

        //      System.out.println("Item 1: " + item1.name + ", " + item1.price + ", " + item1.size);
        //    System.out.println("Item 2: " + item2.name + ", " + item2.price + ", " + item2.size);

        // total = {item1.price + item2.price*2} * {1 + tax};
        double total = 0;
        int mesaurment = 3;

        c1.addItems(items);
        // c1.setsize(mesaurment);

        // System.out.println("Customer name: " + c1.getname() + " size: " + c1.getsize());
        System.out.println("Customer name: " + c1.getname() + " size: " + c1.getsize() + "," + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
            /*if (c1.getsize().equals(item.getSizee())) {
                total = total + item.getprice();*/
            //System.out.println("Item: " + item.getnameee() + ", " + item.getprice() + ", " + item.getSizee());
            //System.out.println("Items: " + item.getnameee());
            // total = total + (total * tax);
            //if (total > 15) { break; }       //  System.out.println("Total = " + total);
            // }

            System.out.println("Item output "  + item);

        }
        int average = 0;
        int count = 0;

//Exercise 7.1
        for (Clothing item : c1.getItems()) {
            if (item.getSizee().equals("L")) {
                count++;
                average += item.getprice();
            }

        }
        try {
            average = average / count;
            System.out.println("Average price: " + average + ", count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't devide by 0");
        }

        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            System.out.println("Item output "+item);
        }

    }
}

