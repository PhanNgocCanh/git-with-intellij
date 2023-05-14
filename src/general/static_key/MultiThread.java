package general.static_key;

public class MultiThread {
    public static void main(String[] args) {
         Count count = new Count();
         Thread t1 = new Thread(new Access("Thread 1",count));
         Thread t2 = new Thread(new Access("Thread 2",count));
         t1.start();
         t2.start();
    }
}
