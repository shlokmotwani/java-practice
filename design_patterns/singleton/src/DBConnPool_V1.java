// implementation of a class having a static object

public class DBConnPool_V1 {
    private static final DBConnPool_V1 instance = new DBConnPool_V1();

    public static DBConnPool_V1 getInstance(){
        return instance;
    }
}
