import java.util.HashSet;
import java.util.Set;

public class WishList {
    private final Set<Item> wishlist;

    public WishList(){
        this.wishlist = new HashSet<>();
    }

    public void addToWishList(Item item){
        this.wishlist.add(item);
    }

    public void removeFromWishList(Item item){
        this.wishlist.remove(item);
    }

    public Set<Item> getItemsFromWishList(){
        return this.wishlist;
    }
}
