import java.util.concurrent.Callable;

public class Task implements Callable<Void> {
    private int x;

    public Task(int x){
        this.x = x;
    }

    public Void call() throws Exception{
        System.out.println(String.format("Task x is running on %s", Thread.currentThread().getName()));
        System.out.println(String.format("The value of x is: %s", x));

        return null;
    }
}
