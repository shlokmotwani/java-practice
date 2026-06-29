import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value){
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(long i=0; i<=100; i++){
            this.value.setX(this.value.getX() + i);
        }
        return null;
    }
}
