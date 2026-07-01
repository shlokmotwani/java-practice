package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoldItem soldItem = SoldItem
                .getBuilder()
                .setName("Item 1")
                .setPrice(100)
                .setQuantity(5)
                .setDiscount(10)
                .setDeliveryCharge(15)
                .setNotes("Kindly gift wrap it")
                .build();

        System.out.println(soldItem);
    }
}