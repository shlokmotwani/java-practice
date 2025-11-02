public class PrintNumber implements Runnable {
    private int number;

    public PrintNumber(int number){
        this.number = number;
    }

    public void print(){
        System.out.println(this.number);
    }

    @Override
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
        this.print();
    }
}
