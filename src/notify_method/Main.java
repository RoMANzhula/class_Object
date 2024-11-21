package notify_method;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    // we notified only first thread, Producer #2 is waiting... always

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        AtomicInteger counter = new AtomicInteger(1);

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
                System.out.println("Producer #" + counter + " is calling method produce.");
                counter.getAndIncrement();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        });

        Thread consumer = new Thread(resource::consume);

        producer.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        consumer.start();

    }

}
