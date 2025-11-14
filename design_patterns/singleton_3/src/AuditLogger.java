import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AuditLogger {
    private static volatile AuditLogger logger;
    private static final Lock lock = new ReentrantLock();

    private AuditLogger(){
        // implementation details
    }

    public static AuditLogger getInstance(){
        if(logger == null){
            // double-check locking to ensure thread-safety
            lock.lock();
          try{
              if(logger == null){
                  logger = new AuditLogger();
              }
          }
          finally {
              lock.unlock();
          }
        }
        return logger;
    }
}
