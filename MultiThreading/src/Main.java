import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running thread: " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1; i<=100; i++){
            PrintNumber pn = new PrintNumber(i);
            System.out.println("i = " + i + " ");
            executorService.execute(pn);
        }
    }
}