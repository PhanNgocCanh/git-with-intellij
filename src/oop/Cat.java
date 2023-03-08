package oop;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi I am "+super.getName());
    }
}
