package wait_with_timeout_method;

public class SharedResource {

    public synchronized void produce() throws InterruptedException {
        System.out.println("Producer is waiting for 3 seconds...");

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            wait(1000);
        }


        System.out.println("Producer resumed after timeout!");
    }

}
