// implementation of a regular class (non-singleton)

public class DBConnPool_V0 {
    private DBConnPool_V0 instance;

    public DBConnPool_V0(){
        // implementation logic goes here
    }

    public DBConnPool_V0 getInstance(){
        return this.instance;
    }
}
