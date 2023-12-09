package threading;

class thread1 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1");
        }
    }
}

class thread2 extends Thread{
    @Override
    public void run() {
        while (true)
        {
            System.out.println("Thread 2");
        }
    }
}
public class threads {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
