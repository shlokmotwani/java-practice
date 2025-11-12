import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConfigurationManager {
    private static volatile ConfigurationManager config;
    private static final Lock lock = new ReentrantLock();

    private ConfigurationManager(){
        // initialization of constructor
        // loading configuration from a file
    }

    public static ConfigurationManager getInstance(){
        if(config == null){
            // double-check locking to ensure thread-safety
            lock.lock();
            try{
                if(config == null){
                    config = new ConfigurationManager();
                }
            }
            finally {
                lock.unlock();
            }
        }
        return config;
    }
}
