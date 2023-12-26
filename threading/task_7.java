package threading;

import java.lang.management.RuntimeMXBean;

class FT implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("First thread is interrupted while sleeping");
            }
        }
    }
}

class ST implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Hello");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Second thread is interrupted while sleeping");
            }
        }
    }
}

class TT implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Welcome");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Third thread is interrupted while sleeping");
            }
        }
    }
}

public class task_7 {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("good morning");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread Interrupted");
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread Interrupted");
                    }
                }
            }
        };

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("how are you");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted");
                    }
                }
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
        new Thread(runnable3).start();


    }
}
