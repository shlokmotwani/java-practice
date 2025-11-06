//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create a few Book objects
        Book eatThatFrog = new Book(5, "Eat That Frog!", 300, 1, "Brian Tracy");
        Book egoBook = new Book(10, "Ego Is The Enemy", 400, 4, "Ryan Holiday");
        Book zeroToOne = new Book(11, "Zero To One", 799, 40, "Peter Thiel");
        Book stalker = new Book(12, "Stalker", 200, 1, "Lars Kepler");
        Book deepWork = new Book(13, "Deep Work", 900, 20, "Cal newport");

        //create a few Electronics objects
        Electronics macbook = new Electronics(3, "Macbook M2", 77000, 3, 5);
        Electronics iphone14 = new Electronics(2, "iPhone 14 pro", 100000, 1, 2);
        Electronics iPad = new Electronics(110, "iPad 10", 65000, 32, 3);
        Electronics charger = new Electronics(111, "Macbook Charger", 8000, 3, 0);
        Electronics keyboard = new Electronics(112, "Dell Keyboard", 1200, 30, 1);


        // Other objects
        Item delisogaGlass = new Item(1, "Delisoga Glass", 250, 1);
        Clothing bluorangeTee = new Clothing(4, "Orange Tee", 3000, 10, "XL");



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
        booksInventory.addItem(egoBook);
        booksInventory.addItem(zeroToOne);
        booksInventory.addItem(stalker);
        booksInventory.addItem(deepWork);

        System.out.println("**************** Books Inventory ******************");
        booksInventory.printAllItems();

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(macbook);
        electronicsInventory.addItem(iphone14);
        electronicsInventory.addItem(iPad);
        electronicsInventory.addItem(charger);
        electronicsInventory.addItem(keyboard);

        System.out.println("**************** Electronics Inventory ******************");
        electronicsInventory.printAllItems();

        RecentlyViewedItems history = new RecentlyViewedItems();
        history.addRecentlyViewedItem(iphone14);
        history.addRecentlyViewedItem(zeroToOne);
        history.addRecentlyViewedItem(eatThatFrog);
        history.addRecentlyViewedItem(deepWork);
        history.addRecentlyViewedItem(stalker);
        history.addRecentlyViewedItem(delisogaGlass);
        history.addRecentlyViewedItem(iPad);
        history.addRecentlyViewedItem(stalker);
        history.addRecentlyViewedItem(charger);
        history.addRecentlyViewedItem(eatThatFrog);
        history.addRecentlyViewedItem(macbook);
        history.addRecentlyViewedItem(deepWork);
        history.addRecentlyViewedItem(stalker);
        history.addRecentlyViewedItem(charger);
        history.addRecentlyViewedItem(keyboard);
        history.addRecentlyViewedItem(macbook);
        history.addRecentlyViewedItem(iPad);

        System.out.println("**************** Top 10 Recently Viewed Items ******************");
        history.printRecentlyViewedItems();


        Order order1 = new Order(1, true);
        Order order2 = new Order(2, false);
        Order order3 = new Order(3, false);
        Order order4 = new Order(4, true);
        Order order5 = new Order(5, true);

        OrderProcessor op = new OrderProcessor();
        op.addOrder(order1);
        op.addOrder(order2);
        op.addOrder(order3);
        op.addOrder(order4);
        op.addOrder(order5);

        System.out.println("**************** Order Processing *******************");
        while(op.getSize() > 0){
            op.processOrder();
        }
    }
}