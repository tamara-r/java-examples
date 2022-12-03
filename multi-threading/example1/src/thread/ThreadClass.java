package thread;

public class ThreadClass extends Thread {
    private int number;

    public ThreadClass(int number) {
        this.number = number;
    }
    // execution code for thread
    public void run() {
        int counter = 0;
        int numInt = 0;

        //prints the number till specified number is reached, starting from 10
        do {
            numInt = (int) (counter + 10);
            System.out.println(this.getName() + " prints " + numInt);
            counter++;
        } while(numInt != number);

        System.out.println(this.getName() + " has ran for " + counter + " times.");
    }
}
