
public class ProducerConsumer {
    public static void main(String[] args)
            throws InterruptedException {

        SharedData data = new SharedData();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    data.produce(i);
                }
                data.finish();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                data.finish();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    data.consume();

                    if (data.isFinished()) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Processing completed.");
    }
}

class SharedData {
    private int number;
    private boolean available = false;
    private boolean finished = false;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (available) {
            wait();
        }

        number = value;
        available = true;

        System.out.println("Produced: " + number);
        notifyAll();
    }

    public synchronized void consume()
            throws InterruptedException {

        while (!available && !finished) {
            wait();
        }

        if (available) {
            System.out.println("Consumed: " + number);
            available = false;
            notifyAll();
        }
    }

    public synchronized void finish() {
        finished = true;
        notifyAll();
    }

    public synchronized boolean isFinished() {
        return finished && !available;
    }
}


