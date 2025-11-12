 /* implementation of a class having a static object (eager implementation)
 * this implementation is thread-safe, but the instance of 'DBConnPool_V1' gets created eagerly, irrespective of
 * whether it is needed or not.
 * Also, there cannot be any configurations implemented with the instantiation of the 'DBConnPool_V1' object.
 */

public class DBConnPool_V1 {
    private static final DBConnPool_V1 instance = new DBConnPool_V1();

    private DBConnPool_V1(){
        // implementation logic
    }

    public static DBConnPool_V1 getInstance(){
        return instance;
    }
}
