//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Item delisogaGlass = new Item(1, "Delisoga Glass", 250, 1);
        Item iphone14 = new Electronics(2, "iPhone 14 pro", 100000, 1, 2);
        Electronics macbook = new Electronics(3, "Macbook M2", 77000, 3, 5);
        Clothing bluorangeTee = new Clothing(4, "Orange Tee", 3000, 10, "XL");
        Book eatThatFrog = new Book(5, "Eat That Frog!", 300, 1, "Brian Tracy");


        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(delisogaGlass);
        inventory.addItem(iphone14);
        inventory.addItem(macbook);
        inventory.addItem(bluorangeTee);
        inventory.addItem(eatThatFrog);
        inventory.addItem(eatThatFrog);

        System.out.println("**************** Generic Inventory ******************");
        inventory.printAllItems();

        Inventory<Book> booksInventory = new Inventory<>();
        booksInventory.addItem(new Book(10, "Ego Is The Enemy", 400, 4, "Ryan Holiday"));
        booksInventory.addItem(new Book(11, "Zero To One", 799, 40, "Peter Thiel"));
        booksInventory.addItem(new Book(12, "Stalker", 200, 1, "Lars Kepler"));
        booksInventory.addItem(new Book(13, "Deep Work", 900, 20, "Cal newport"));

        System.out.println("**************** Books Inventory ******************");
        booksInventory.printAllItems();
    }
}