package runnable;

public class ThreadClass implements Runnable {
    private int number;

    public ThreadClass(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int counter = 0;
        int numInt = 0;

        do {
            numInt = (int) (counter + 10);
            System.out.println(Thread.currentThread().getName() + " prints " + numInt);
            counter++;
        } while(numInt != number);

        System.out.println(Thread.currentThread().getName() + " has ran for " + counter + " times.");
    }
}
