package general.static_key;

public class UsingStaticExample {
    private static String subject;
    static{
        System.out.println("Trước khi khởi taọ hàm main");
    }
    static{
        subject = "Đây là subject";
    }
    static class MyWebsite{
        public static String website = "Đây là website";
    }
    UsingStaticExample(){
        System.out.println("Hàm main được khởi tạo");
        System.out.println("website = "+MyWebsite.website);
        System.out.println("subject = "+subject);
    }

    public static void main(String[] args) {
        UsingStaticExample u = new UsingStaticExample();
    }
}
