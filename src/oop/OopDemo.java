package oop;

public class OopDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Dogmunt");
        Cat cat = new Cat("Tom");
        Zoo zoo = new Zoo();
        zoo.add(dog);
        zoo.add(cat);
        zoo.ShowAnimalInZoo();
    }
}
