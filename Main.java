package com.warehouse.core;

public class Main{
    public static void main(String[] args){
        Truck v1 = new Truck("123Kg" , 500);
        v1.printid();
        v1.printweight();

        try {
            v1.dispatch();
        }

        catch (OverloadException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        finally {
            System.out.println("Dispatch process ended");
        }

        Thread t1 = new Thread(new LoadingTask());
        Thread t2 = new Thread(new LoadingTask());

        t1.start();
        t2.start();
    }
}
