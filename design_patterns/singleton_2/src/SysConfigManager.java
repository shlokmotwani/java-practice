import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SysConfigManager {
    private static volatile SysConfigManager instance;
    private String connectionString;
    private String logLevel;
    private static Lock lock = new ReentrantLock();

    private SysConfigManager(){
        // initialization implementation
        System.out.println("System Configuration Manager created.");
        loadSettings();
    }

    public static SysConfigManager getInstance(){
        if(instance == null){
            // double-check locking
            lock.lock();
           try{
               if(instance == null){
                   instance = new SysConfigManager();
               }
           }
           finally {
               lock.unlock();
           }
        }
        return instance;
    }

    private void loadSettings() {
        // load settings and store in 'connectionString'
    }

    public String getConnectionString() {
        return connectionString;
    }

    public String getLogLevel() {
        return logLevel;
    }
}
