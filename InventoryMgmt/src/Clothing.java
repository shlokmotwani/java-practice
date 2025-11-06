public class Clothing extends Item{
    private String size;

    public Clothing(int id, String name, double price, int qty, String size){
        super(id, name, price, qty);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
