package org.example;

public class SoldItem {
    private String name;
    private int price;
    private int quantity;
    private int discount;
    private int deliveryCharge;
    private String notes;

    private SoldItem(SoldItemBuilder builder){
        this.name = builder.name;
        this.price = builder.price;
        this.quantity = builder.quantity;
        this.discount = builder.discount;
        this.deliveryCharge = builder.deliveryCharge;
        this.notes = builder.notes;
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
            if(name == null){
                throw new IllegalStateException("Name is required");
            }
            if(price <= 0){
                throw new IllegalStateException("Price must be positive");
            }

            return new SoldItem(this);
        }
    }
}