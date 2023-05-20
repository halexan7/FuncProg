package com.learnJava.lambdas;

public class RunnableExample {
    public static void main(String[] args){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();


        Runnable run2 = () -> System.out.println("Inside runnable 2");

        new Thread(run2).start();
        new Thread(() -> System.out.println("Hello")).start();
    }
}
