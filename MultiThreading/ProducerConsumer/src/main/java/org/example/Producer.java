package org.example;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run(){
        while(true){
            synchronized (this.store){
                if(this.store.getInventory().size() < this.store.getMAX_SIZE()){
                    this.store.addItem(new Object());
                }
            }
        }
    }
}
