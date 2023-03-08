package design_pattern.single_ton;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void initData(){
        System.out.println("khởi tạo");
    }
}
