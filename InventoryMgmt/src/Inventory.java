import java.util.ArrayList;
import java.util.HashMap;

public class Inventory<T extends Item> {
    private HashMap<Integer, T> hashmap;

    public Inventory(){
        this.hashmap = new HashMap<Integer, T>();
    }

    public void addItem(T item){
        this.hashmap.put(item.getId(), item);
    }

    public void removeItem(int id){
        this.hashmap.remove(id);
    }

    public void removeItem(T item){
        this.hashmap.remove(item.getId());
    }

    public T getItem(int id){
        return this.hashmap.get(id);
    }

    public ArrayList<T> getAllItems(){
        return new ArrayList<T>(this.hashmap.values());
    }

    public void printAllItems(){
        for(int itemID: this.hashmap.keySet()){
            T item = this.hashmap.get(itemID);
            System.out.printf("Item ID: %s --- Item name: %s%n", itemID, item.getName());
        }
    }


}
