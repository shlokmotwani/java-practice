package org.example;

public class SoldItem {
    private String name;
    private int price;
    private int quantity;
    private int discount;
    private int deliveryCharge;
    private String notes;

    private SoldItem(SoldItemBuilder builder){
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

    public static class SoldItemBuilder {
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
}
