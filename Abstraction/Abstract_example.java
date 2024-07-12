

//An abstract class is a class that cannot be instantiated on its own and is intended to be inherited by other classes.
// It provides a way to define a blueprint for other classes to follow. 


abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public abstract void sound();

    public abstract void habitat();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void habitat() {
        System.out.println("Land");
    }

}

public class Abstract_example {
    public static void main(String[] args) {
        Dog myDog = new Dog("Pitbull");
        myDog.getName(); // Pitbull
        myDog.sound(); // Woof
        myDog.habitat(); // Land
    }
}
