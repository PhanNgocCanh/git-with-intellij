package abstract_class;

public class Cat extends Animal{
    private String name;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void getSound() {
        System.out.println("meow meow");
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
