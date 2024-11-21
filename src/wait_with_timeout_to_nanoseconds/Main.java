package wait_with_timeout_to_nanoseconds;

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

        producer.start();
    }

}
