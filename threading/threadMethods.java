package threading;

class t1 implements Runnable {
    public void run() {
        System.out.println("This is shoot in thread 1");
    }
}

class t2 implements Runnable {
    public void run() {
        System.out.println("This is shoot in thread 2");
    }
}
public class threadMethods {
    public static void main(String[] args) {
        t1 gun1 = new t1();
//        Runnable bullet = new Runnable(gun1);
        Thread bullet = new Thread(gun1);
        t2 gun2 = new t2();
        Thread bullet2 = new Thread(gun2);
        bullet.start();
        bullet2.start();

    }
}
