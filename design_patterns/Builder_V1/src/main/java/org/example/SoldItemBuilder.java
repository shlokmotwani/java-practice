package org.example;

public class SoldItemBuilder {
    private String name;
    private int price;
    private int quantity;
    private int discount;
    private int deliveryCharge;
    private String notes;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public int getDeliveryCharge() {
        return deliveryCharge;
    }

    public String getNotes() {
        return notes;
    }

    public SoldItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SoldItemBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public SoldItemBuilder setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    public SoldItemBuilder setDeliveryCharge(int deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
        return this;
    }

    public SoldItemBuilder setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public SoldItem build(){
        return new SoldItem(this);
    }
}
