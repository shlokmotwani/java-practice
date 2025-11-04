public class Task implements Runnable {
    private int x;

    public Task(int x){
        this.x = x;
    }

    public void run(){
        System.out.println(String.format("Task x is running on %s", Thread.currentThread().getName()));
        System.out.println(String.format("The value of x is: %s", x));
    }
}
