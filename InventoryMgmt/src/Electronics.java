public class Electronics extends Item{
    private int warranty;

    public Electronics(int id, String name, double price, int qty, int warranty){
        super(id, name, price, qty);
        this.warranty = warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }
}
