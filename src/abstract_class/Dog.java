package abstract_class;

public class Dog extends Animal {
    private String name;
    private String sound;

    public Dog(String name,String sound){
        this.name = name;
        this.sound = sound;
    }
    @Override
    void getSound() {
        System.out.println("go go");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            Dog dog = (Dog) obj;
            if(dog.getName().equals(this.getName())) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.name.hashCode()+this.sound.hashCode());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
