package notify_method;

public class SharedResource {

    public synchronized void produce() throws InterruptedException {

        for (int i = 1; i < 3; i++) {
            System.out.println("Producer #" + i + " is waiting...");

            wait();

            System.out.println("Producer #" + i + " resumed!");
        }

    }

    public synchronized void consume() {
        System.out.println("Consumer is notifying...");

        notify(); //wakes up one thread
    }

}
