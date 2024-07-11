// Hierarchical Inheritance -> One Super/Base class and other classes are derived from common Super/Base class 

class A {
    String animal;

    A(String animal) {
        this.animal = animal;
    }

    void showAnimal() {
        System.out.println("This is a " + animal);
    }
}

class B extends A {
    String habitat;

    B(String habitat, String animal) {
        super(animal);
        this.habitat = habitat;
    }

    void showHabitat() {
        System.out.println("Habitat of this " + animal + " is " + habitat);
    }
}

class C extends A {
    String food;

    C(String animal, String food) {
        super(animal);
        this.food = food; 
    }

    void showFood() {
        System.out.println(animal + " eats " + food);
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        B obj1 = new B("water", "fish");
        C obj2 = new C("Cow", "grass");

        obj1.showAnimal();
        obj1.showHabitat();
        
        obj2.showAnimal();
        obj2.showFood();
    }
}
