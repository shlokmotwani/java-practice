import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value){
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(long i=0; i<=10000; i++){
                this.value.increment(i);
        }
        return null;
    }
}
