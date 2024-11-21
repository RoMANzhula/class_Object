package wait_method;

public class Main {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        });

        Thread consumer = new Thread(resource::consume);

        producer.start();

        try {
            Thread.sleep(1000); // 1 second waiting
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        consumer.start();
    }

}
