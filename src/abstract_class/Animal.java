package abstract_class;

public abstract class Animal {
    private String sound;
    private String name;
    abstract void getSound();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
