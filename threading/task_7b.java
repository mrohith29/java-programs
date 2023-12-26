package threading;
class ProducerConsumer {
    int value = 0;
    boolean produced = false;

    synchronized void produce() throws InterruptedException {
        while (true) {
            while (produced)
                wait();

            System.out.println("Producer produced-" + value);
            value++;
            produced = true;
            notify();
            Thread.sleep(1000);
        }
    }

    synchronized void consume() throws InterruptedException {
        while (true) {
            while (!produced)
                wait();

            System.out.println("Consumer consumed-" + value);
            produced = false;
            notify();
            Thread.sleep(2000);
        }
    }
}

public class task_7b {
    public static void main(String[] args) {
        final ProducerConsumer pc = new ProducerConsumer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
//        notify();
        t2.start();
    }
}