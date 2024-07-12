interface Flyable {
    void fly();
}

interface Walkable{
    void walk(); 
}

class Bird implements Walkable ,Flyable{ 
    @Override
    public void fly() {
        System.out.println("i can fly");
    }

    @Override
    public void walk() {
        System.out.println("i can walk");
    }
}


public class Multiple_Inheritance{ 
    public static void main(String[] args) {
        Bird bird = new Bird(); 
        bird.fly(); 
        bird.walk();
    }

}