package notifyAll_method;

public class SharedResource {

    public synchronized void produce() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is waiting...");

        wait();

        System.out.println(Thread.currentThread().getName() + " resumed!");
    }

    public synchronized void consume() {
        System.out.println("Consumer is notifying all producers...");

        notifyAll();
    }

}
