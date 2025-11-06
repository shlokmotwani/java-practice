import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private final LinkedList<Item> recentItems;
    private final int MAX_SIZE;

    public RecentlyViewedItems(){
        this.recentItems = new LinkedList<>();
        MAX_SIZE = 10;
    }

    public void addRecentlyViewedItem(Item item){
        this.recentItems.remove(item);
        this.recentItems.addFirst(item);
        if(this.recentItems.size() > this.MAX_SIZE){
            this.recentItems.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems(){
        return this.recentItems;
    }

    public void printRecentlyViewedItems(){
        int count = 0;
        for(Item item: this.recentItems){
            System.out.println(++count + ". " + item);
        }
    }
}
