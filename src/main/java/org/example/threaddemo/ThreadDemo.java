package org.example.threaddemo;

public class ThreadDemo {
    public  static void show() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        thread.join();
        System.out.println("File is ready to be scanned.");
    }
}
