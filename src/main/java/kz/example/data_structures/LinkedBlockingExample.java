package kz.example.data_structures;

import java.util.concurrent.*;

public class LinkedBlockingExample {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try (ExecutorService pool = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>())){
//            ExecutorService pool = Executors.newFixedThreadPool(10);

            for (int i = 0; i < 10_000_000; i++) {
                pool.submit(() -> {});
            }
            pool.shutdown();
        } finally {
            time = System.currentTimeMillis() - time;
            System.out.println("time = " + time + " ms");
        }


    }
}
