package notifyAll_method;

public class Main {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer1 = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }, "Producer-1");

        Thread producer2 = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }, "Producer-2");

        Thread consumer = new Thread(resource::consume);

        producer1.start();
        producer2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        consumer.start();

    }

}
