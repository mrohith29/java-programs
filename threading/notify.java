package threading;
class threadI extends Thread {
    int total =0;
    public void run() {
        synchronized (this) {
            System.out.println("Child thread start calculation");
            for (int i = 0; i < 100; i++) {
                total += total;
            }
            System.out.println(this.getState());
            System.out.println("Child Thread try to give notification");
            this.notify();
            System.out.println(this.getState());
        }
    }
}
public class notify {
    public static void main(String[] args) throws InterruptedException {
        threadI b = new threadI();
        b.start();
        System.out.println(b.getState());

        synchronized (b) {
            System.out.println("Main thread ceiling wait() method");
            System.out.println(b.getState());
            b.wait();
            System.out.println("main thread got notified");
            System.out.println(b.total);
        }
    }
}
