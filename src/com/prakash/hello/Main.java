package com.prakash.hello;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("Hello world by Prakash");
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
