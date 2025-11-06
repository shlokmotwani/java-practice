import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        Item delisogaGlass = new Item(1, "Delisoga Glass", 250, 1);
        Item iphone14 = new Electronics(2, "iPhone 14 pro", 100000, 1, 2);
        Electronics macbook = new Electronics(3, "Macbook M2", 77000, 3, 5);
        Clothing bluorangeTee = new Clothing(4, "Orange Tee", 3000, 10, "XL");
        Book eatThatFrog = new Book(5, "Eat That Frog!", 300, 1, "Brian Tracy");

        list.add(delisogaGlass);
        list.add(iphone14);
        list.add(macbook);
        list.add(bluorangeTee);
        list.add(eatThatFrog);

       list.forEach(item -> System.out.println(item.getName()));
        Collections.sort(list);
        list.forEach(item -> System.out.println(item.getName()));
    }
}