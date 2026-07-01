package org.example;

public class SoldItem {
    private String name;
    private int price;
    private int quantity;
    private int discount;
    private int deliveryCharge;
    private String notes;

    public SoldItem(SoldItemBuilder builder){
        this.name = builder.getName();
        this.price = builder.getPrice();
        this.quantity = builder.getQuantity();
        this.discount = builder.getDiscount();
        this.deliveryCharge = builder.getDeliveryCharge();
        this.notes = builder.getNotes();
    }

    public static SoldItemBuilder getBuilder(){
        return new SoldItemBuilder();
    }

    @Override
    public String toString() {
        return String.format("%d units of %s bought at $%d per unit, discount applied: %d, delivery charge: $%d, NOTES: %s",
                quantity, name, price, discount, deliveryCharge, notes);
    }
}
