package test;

import runnable.ThreadClass;

public class Test {
    public static void main(String[] args) {

        Thread thread_1 = new Thread(new ThreadClass(15));
        Thread thread_2 = new Thread(new ThreadClass(20));

        // thread id
        System.out.println("Thread " + thread_1.getName() + " ID: " + thread_1.getId());
        System.out.println("Thread " + thread_2.getName() + " ID: " + thread_2.getId());

        System.out.println("Thread " + thread_1.getName() + " state is " + thread_1.getState());
        System.out.println("Thread " + thread_2.getName() + " state is " + thread_2.getState());

        System.out.println("Starting " + thread_1.getName() + "...");
        //start the thread
        thread_1.start();
        System.out.println("Thread " + thread_1.getName() + " state is " + thread_1.getState());
        System.out.println("Is " + thread_1.getName() + " alive? " + thread_1.isAlive());

        try {
            System.out.println("Thread " + thread_1.getName() + " state is " + thread_1.getState());
            // sleep the thread
            thread_1.sleep(1000);

            thread_1.interrupt();

            if(thread_1.isInterrupted()) {
                System.out.println("Thread " + thread_1.getName() + " is interrupted");
                System.out.println("Thread " + thread_1.getName() + " state is " + thread_1.getState());
            }

            System.out.println("Killing the " + thread_1.getName() + "...");

            System.out.println("Is " + thread_1.getName() + " alive? " + thread_1.isAlive() + '\n');

            if(!thread_1.isAlive()) {
                System.out.println("Starting " + thread_2.getName() + "...");
                thread_2.start();

                System.out.println("Thread " + thread_2.getName() + " ID: " + thread_1.getId());

                System.out.println("Thread " + thread_2.getName() + " priority is " + thread_2.getPriority());

                System.out.println("Setting the max priority...");

                thread_2.setPriority(Thread.MAX_PRIORITY);
                System.out.println("Thread " + thread_2.getName() + " priority is " + thread_2.getPriority());

                System.out.println("Thread " + thread_2.getName() + " state is " + thread_2.getState());
            }
        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }
    }
}
