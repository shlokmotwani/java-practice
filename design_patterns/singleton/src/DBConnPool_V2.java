// implementation of a singleton class that checks for the existence of the instance in getInstance() method
// If it exists, it returns it. If it doesn't exist, it creates a new one and returns it.
// This implementation is not thread-safe!

public class DBConnPool_V2 {
    private DBConnPool_V2 instance;

    private DBConnPool_V2(){
        this.instance = new DBConnPool_V2();
    }

    public DBConnPool_V2 getInstance(){
        if(this.instance == null){
            // multiple threads can enter this critical section and create that many instances of 'DBConnPool_V2'
            this.instance = new DBConnPool_V2();
        }
        return this.instance;
    }
}
