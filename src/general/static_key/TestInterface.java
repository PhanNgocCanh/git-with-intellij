package general.static_key;

public class TestInterface implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Showable s = new TestInterface();
        s.print();
    }
}
