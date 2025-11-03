import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Running thread: " + Thread.currentThread().getName());
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=1; i<=10000; i++){
            PrintNumber pn = new PrintNumber(i);
            if(i == 8000){
                System.out.println("Reached iteration #80");
            }
            es.execute(pn);
        }
    }
}