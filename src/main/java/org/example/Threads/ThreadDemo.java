package org.example.Threads;

import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                4,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new CustomizableThreadFactory(),
                new Runner().new CustomRejectHandler());

        // EXAMPLE FOR ThreadPool Executors

//
//        for(int i=1;i<=10;i++)
//        {
//
//            threadPoolExecutor.submit(new MyTask());
//
//            threadPoolExecutor.submit(()-> System.out.println("Task is processes by ") );
//           // System.out.println("task processes by "+Thread.currentThread().getName());
//        }

        CompletableFuture<String> asynkTask1 = CompletableFuture.supplyAsync(() -> {
            return "Hey";
        }, threadPoolExecutor);

        try {
            System.out.println(asynkTask1.get());
        } catch (Exception ex) {
            System.out.println(ex);
        }


        //this is runnable object
//
//        Future<?> futureObj= threadPoolExecutor.submit(new MyTask());
//
//
//        //this is how we check future object done the work or not by the get() methods
//
//        System.out.println("is Done "+futureObj.isDone());
//        try{
//            futureObj.get(2,TimeUnit.SECONDS);
//        }
//        catch (Exception ex)
//        {
//            System.out.println("Timedout exception happend ");
//        }
//
//        try {
//            futureObj.get();
//        }
//        catch (Exception ex)
//        {
//
//        }
//        System.out.println("is Done "+futureObj.isDone());
//        System.out.println("is Cancelled  "+futureObj.isCancelled());
//


    }


    class CustomThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            Thread th = new Thread(r);
            th.setPriority(Thread.NORM_PRIORITY);
            th.setDaemon(false);
            return th;
        }
    }

    class CustomRejectHandler implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(" Task rejected ");
        }
    }
}
