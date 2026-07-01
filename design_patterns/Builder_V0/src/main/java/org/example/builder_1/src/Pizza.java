import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String crust;
    private String size;
    private String sauce;
    private String cheese;
    private List<String> toppings;
    private boolean isStuffed;

    private Pizza(PizzaBuilder builder){
        this.crust = builder.getCrust();
        this.size = builder.getSize();
        this.sauce = builder.getSauce();
        this.cheese = builder.getCheese();
        this.toppings = new ArrayList<>(builder.getToppings());
        this.isStuffed = builder.isStuffed();
    }

    public String getCrust() {
        return crust;
    }

    public String getSize() {
        return size;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    @Override
    public String toString() {
        return String.format("Pizza with crust: %s, size: %s, sauce: %s, cheese (if any): %s.", this.crust, this.size, this.sauce, this.cheese);
    }

    public static PizzaBuilder getBuilder(){
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private String crust;
        private String size;
        private String sauce;
        private String cheese;
        private final List<String> toppings = new ArrayList<String>();
        private boolean isStuffed;

        public String getCrust() {
            return crust;
        }

        public String getSize() {
            return size;
        }

        public String getSauce() {
            return sauce;
        }

        public String getCheese() {
            return cheese;
        }

        public List<String> getToppings() {
            return Collections.unmodifiableList(toppings);
        }

        public boolean isStuffed(){
            return isStuffed;
        }

        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addTopping(String topping){
            this.toppings.add(topping);
            return this;
        }

        public PizzaBuilder setStuffedCrust(boolean isStuffed){
            this.isStuffed = isStuffed;
            return this;
        }

        public Pizza build(){
            // validation checks
            if (this.crust == null || this.size == null || this.sauce == null) {
                throw new IllegalStateException("Required fields (Crust, Size, Sauce) must be set before building the Pizza.");
            }
            return new Pizza(this);
        }
    }

}
