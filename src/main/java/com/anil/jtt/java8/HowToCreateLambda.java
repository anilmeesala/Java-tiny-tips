package com.anil.jtt.java8;

public class HowToCreateLambda {
    public static void main(String[] args) {
        //option:1
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread running");
            }
        };
        t.start();

        //option:2
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                System.out.println("Thread running");
            }
        });
        t1.start();
    }
}
