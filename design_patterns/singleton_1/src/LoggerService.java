// lazy initialized, thread-safe implementation of Singleton Design Pattern

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LoggerService {
    private static volatile LoggerService instance;
    private static Lock lock = new ReentrantLock();

    private LoggerService(){
        // implementation of the logger service
        System.out.println("LoggerService instance created.");
    }

    public static LoggerService getInstance(){
        if(instance == null){
            // double-check locking to ensure thread-safety
            lock.lock();
           try{
               if(instance == null){
                   // lazy initialization
                   instance = new LoggerService();
               }
           }
           finally {
               // lock gets released regardless of the execution of the above try block
               lock.unlock();
           }
        }
        return instance;
    }
}
