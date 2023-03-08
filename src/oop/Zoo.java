package oop;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    public void add(Animal animal){
        animals.add(animal);
    }
    public void ShowAnimalInZoo(){
        for(Animal animal : animals){
            animal.sayHello();
        }
    }
}
