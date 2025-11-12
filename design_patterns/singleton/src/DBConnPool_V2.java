// implementation of a singleton class that checks for the existence of the instance in getInstance() method
// If it exists, it returns it. If it doesn't exist, it creates a new one and returns it.
// This implementation is not thread-safe!

public class DBConnPool_V2 {
    private static DBConnPool_V2 instance;

    private DBConnPool_V2(){
        // implementation logic
    }

    public DBConnPool_V2 getInstance(){
        if(instance == null){
            // multiple threads can enter this critical section (race condition) and create that many instances of 'DBConnPool_V2'
            instance = new DBConnPool_V2();
        }
        return instance;
    }
}
