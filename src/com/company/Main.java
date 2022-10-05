package com.company;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        Thread threadOne = new MyThread(mainGroup, "Thread One");
        Thread threadTwo = new MyThread(mainGroup, "Thread Two");
        Thread threadThree = new MyThread(mainGroup, "Thread Three");
        Thread threadFour = new MyThread(mainGroup, "Thread Four");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        sleep(15000);
        mainGroup.interrupt();

    }

}
