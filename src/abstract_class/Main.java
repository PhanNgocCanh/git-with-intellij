package abstract_class;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setName("Mèo");
        cat.getSound();
        Animal dog1 = new Dog("dog1", "go1");
        Animal dog2 = new Dog("dog2", "go2");
        Animal dog3 = new Dog("dog2", "go2");
        Set<Animal> animals = new HashSet<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
