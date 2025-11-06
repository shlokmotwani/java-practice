public class Book extends Item{
    private String author;

    public Book(int id, String name, double price, int qty, String author){
        super(id, name, price, qty);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
