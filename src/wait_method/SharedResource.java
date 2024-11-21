package wait_method;

public class SharedResource {

    public synchronized void produce() throws InterruptedException {
        System.out.println("Producer is waiting...");

        wait(); // thread is waiting

        System.out.println("Producer resumed!");
    }

    public synchronized void consume() {
        System.out.println("Consumer is notifying...");

        notify();
    }

}
