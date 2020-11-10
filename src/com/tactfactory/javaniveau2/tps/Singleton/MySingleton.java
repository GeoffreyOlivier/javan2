package com.tactfactory.javaniveau2.tps.Singleton;

import java.util.concurrent.*;

public class MySingleton {

    private MySingleton() {
        task = new FutureTask<Boolean>(new Callable<Boolean>() {

            @Override
            public Boolean call() throws Exception {
                System.out.println(Thread.currentThread().getName());
                return true;
            }
        });
    }

    private static MySingleton INSTANCE = null;

    public static synchronized MySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MySingleton();
        }
        return INSTANCE;
    }

    private final FutureTask<Boolean> task;
    private final ExecutorService executor = Executors.newFixedThreadPool(100);

    public Boolean execTask() throws InterruptedException, ExecutionException {
        executor.execute(this.task);
        executor.awaitTermination(1, TimeUnit.SECONDS);
        return this.task.get();
    }
}
