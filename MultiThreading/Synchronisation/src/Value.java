public class Value {
    private long x = 0;

    public long getX(){
        return this.x;
    }

    public void setX(long x){
        this.x = x;
    }

    public synchronized void increment(long dx){
        this.x += dx;
    }
}
