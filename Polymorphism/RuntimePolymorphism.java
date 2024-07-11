//Runtime Polymorphism => Runtime polymorphism allows method overriding, where the method to be executed is determined at runtime based on the object's type.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
    
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound(); 

        myAnimal = new Cat();
        myAnimal.sound(); 
    }
}
