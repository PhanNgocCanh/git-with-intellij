package general.static_key;

public class Counter {
    private static int count = 0;

    public void setCount() {
        count++;
        System.out.println("count = " + count);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.setCount();
        Counter counter2 = new Counter();
        counter2.setCount();
    }

}
