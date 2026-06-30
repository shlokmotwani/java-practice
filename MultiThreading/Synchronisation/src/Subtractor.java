import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
    private Lock lock;

    public Subtractor(Value value, Lock lock){
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(long i=0; i<=10000; i++){
            lock.lock();
            this.value.setX(this.value.getX() - i);
            lock.unlock();
        }
        return null;
    }
}
