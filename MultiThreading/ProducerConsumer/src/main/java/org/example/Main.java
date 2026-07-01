package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1; i<=10; i++){
            executorService.execute(new Producer(store));
        }

        for(int i=1; i<=10; i++){
            executorService.execute(new Consumer(store));
        }
    }
}