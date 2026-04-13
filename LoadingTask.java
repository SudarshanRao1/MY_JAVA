package com.warehouse.core;

class LoadingTask implements Runnable{
    public void run(){
        for(int i = 0; i < 3; i++ ){
            System.out.println("Loading item...");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
