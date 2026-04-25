package com.warehouse.core;

class Truck extends Vehicle implements Transportable{

    public int cargoWeight;

    Truck(String vehicleID, int cargoWeight) {
        this.vehicleID = vehicleID;
        this.cargoWeight = cargoWeight;
    }
   @Override

   public void dispatch() throws OverloadException {
        if (cargoWeight > 5000) {
            throw new OverloadException("Cargo weight exceeds 5000kg");
        }

    }

    void printid(){
        System.out.println("vechileID: " +vehicleID);
    }

    void printweight(){
        System.out.println("the cargoweight(kg): " +cargoWeight);
    }

}