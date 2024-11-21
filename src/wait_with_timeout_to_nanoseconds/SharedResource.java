package wait_with_timeout_to_nanoseconds;

public class SharedResource {

    public synchronized void produce() throws InterruptedException {
        System.out.println("Producer is waiting for 1.5 second...");

        wait(1500, 50000); // 1.5 second

        System.out.println("Producer resumed after timeout");
    }

}
