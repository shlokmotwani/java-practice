public class Order implements Comparable<Order>{
    private int id;
    private final boolean isExpress;

    public Order(int id,boolean isExpress){
        this.id = id;
        this.isExpress = isExpress;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isExpress(){
        return this.isExpress;
    }

    @Override
    public int compareTo(Order compared) {
        if(this.isExpress){
            if(compared.isExpress){
                if(this.getId() < compared.getId()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
            return -1;
        }
        else if(compared.isExpress) {
            return 1;
        }
        return 0;
    }
}
