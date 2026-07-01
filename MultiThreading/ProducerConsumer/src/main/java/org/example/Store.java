package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Object> inventory;
    private final int MAX_SIZE;

    public Store(){
         this.inventory = new ArrayList<>();
         this.MAX_SIZE = 5;
    }

    public void addItem(Object object){
        System.out.println("Producing item: " + this.getInventory().size());
        this.inventory.add(object);
    }

    public Object removeObject(){
        System.out.println("Consuming item: " + this.getInventory().size());
        Object object = this.inventory.get(this.inventory.size() - 1);
        this.inventory.remove(this.inventory.size() - 1);
        return object;
    }

    public List<Object> getInventory() {
        return this.inventory;
    }

    public int getMAX_SIZE() {
        return this.MAX_SIZE;
    }
}
