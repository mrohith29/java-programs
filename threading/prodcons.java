package threading;

class shiva {
    private boolean produced = false;
    private int count = 0;

    synchronized void produce() {
        while (true) {
            try {
                while (produced) {
                    wait();
                }
                System.out.println("Produced " + count);
                produced = true;
                notify();
                count++;
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }

    synchronized void consume() {
        while (true) {
            try {
                while (!produced) {
                    wait();
                }
                System.out.println("Consumed " + count);
                produced = false;
                notify();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class prodcons {
    public static void main(String[] args) {
        shiva sh = new shiva();
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                sh.produce();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                sh.consume();
            }
        });

t1.start();
t2.start();
    }
}
