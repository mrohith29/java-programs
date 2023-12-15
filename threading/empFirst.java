package threading;

class myThread extends Thread {
    public void run() {
        System.out.println("Child thread implemented");
    }
}
public class empFirst {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        myThread ob = new myThread();
        ob.setPriority(10);

//        ob.setName(t1);
//        ob.getPriority();
//        System.out.println(ob.getName());

        for (int i =0 ; i<10;i++) {
            System.out.println("Main class");
        }
        ob.start();
    }
}
