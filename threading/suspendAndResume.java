//    package threading;
//
//    class myThread1 implements Runnable{
//        String name;
//        Thread t;
//
//        myThread1(String tname) {
//            name = tname;
//            t = new Thread(this.name);
//            System.out.println("New thread "+t);
//        }
//        public void run() {
//            try {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(name + " " + i);
//                    Thread.sleep(2000);
//                }
//
//            } catch (InterruptedException interruptedException) {
//                System.out.println(interruptedException);
//            }
//        }
//    }
//    public class suspendAndResume  {
//        public static void main(String[] args) throws UnsupportedOperationException {
//            myThread1 t1 = new myThread1("one");
//            myThread1 t2 = new myThread1("two");
//            try {
////                Thread.sleep(2000);
//                t1.t.suspend();
//                System.out.println("thread 1 is suspended");
//                t1.t.resume();
//                System.out.println("thread 1 is resumed");
//                Thread.sleep(2000);
//                t2.t.suspend();
//                System.out.println("thread 2 is suspended");
//                t2.t.resume();
//                System.out.println("thread 2 is resumed");
//            } catch (UnsupportedOperationException interruptedException) {
//                System.out.println(interruptedException);
//            }
//
//            try {
//                System.out.println("waiting threads are need to finish");
//                t1.t.join();
//                t2.t.join();
//            } catch (InterruptedException interruptedException) {
//                System.out.println(interruptedException);
//            }
//        }
//    }


package threading;

class myThread1 implements Runnable {
    String name;
    Thread t;

    myThread1(String tname) {
        name = tname;
        t = new Thread(this); // Pass the Runnable object
        System.out.println("New thread " + t);
        t.start(); // Start the thread
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " " + i);
                Thread.sleep(2);
            }
        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
        }
    }
}

public class suspendAndResume {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1("one");
        myThread1 t2 = new myThread1("two");

        try {
            System.out.println("Waiting for threads to finish");
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
        }
    }
}
