package general.static_key;

public class Access implements Runnable{
    private String name;
    private Count count;
    public Access(String name, Count count){
        this.name = name;
        this.count = count;
    }
    @Override
    public synchronized void run() {
        for(int i = 0; i< 3;i++){
            System.out.println(name+" index "+i+" before: "+count.value);
            count.value--;
            System.out.println(name+" index "+i+" before "+count.value);
        }
    }
    public void SayHello(){
        System.out.println("hello abckdj");
    }

}
