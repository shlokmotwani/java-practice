// implementation of a singleton class that checks for the existence of the instance in getInstance() method
// If it exists, it returns it. If it doesn't exist, it creates a new one and returns it.
// This implementation is thread-safe, but has a poor implementation of thread-safety due to the synchronized method.

public class DBConnPool_V3 {
    private DBConnPool_V3 instance;

    private DBConnPool_V3(){
        this.instance = new DBConnPool_V3();
    }

    // Multiple threads cannot enter this critical section due to the 'synchronized' method.
    // This method keeps the threads waiting, defeats the purpose of multithreading and is slow!
    public synchronized DBConnPool_V3 getInstance(){
        if(this.instance == null){
            this.instance = new DBConnPool_V3();
        }
        return this.instance;
    }
}
