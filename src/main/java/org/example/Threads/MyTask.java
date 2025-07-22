package org.example.Threads;

public class MyTask implements  Runnable{

//    int c=0;

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // throw new RuntimeException(e);
        }
        System.out.println("Task is processes by "+Thread.currentThread().getName());
//        c++;
    }
}
