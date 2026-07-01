// implementation of a singleton class that checks for the existence of the instance in getInstance() method
// If it exists, it returns it. If it doesn't exist, it creates a new one and returns it.
// This implementation is thread-safe and is implemented using double-check locking.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnPool_V4 {
    private static volatile DBConnPool_V4 instance;
    private static final Lock lock = new ReentrantLock();

    private DBConnPool_V4(){
        // initialization logic
    }

    public static DBConnPool_V4 getInstance(){
        // Multiple threads can enter this critical section.
        // This is to ensure that the application does not become synchronized (and slow!).

        if(instance == null){ // Only the initial few threads will be able to enter this block, and the rest will divert from here.
            // apply lock
            // this ensures that we allow only one of the threads to enter the block to create an instance of 'DBConnPool_V4'
            lock.lock();
            if(instance == null) {
                instance = new DBConnPool_V4();
            }
            // release lock
            lock.unlock();
        }
        return instance;
    }
}
