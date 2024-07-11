//Single level inheritance 

class A {
    int age;
    String name;

    A(int age, String name) {
        this.age = age;
        this.name = name; 
    }

    void info() {
        System.out.println("His age is : " + age + " " + "His name is " + name);
    }
}

class B extends A {
    String country;

    B(int age, String name, String country) {
        super(age, name);
        this.country = country;
    }

    void info() {
        System.out.println("His age is : " + age + " " + "His name is " + name + " " + "His country is " + country);
    }
}

public class Single_level_Inheritance1 {
    public static void main(String[] args) {
        A obj1 = new A(10, "A");
        obj1.info();

        B obj2 = new B(20, "B", "India"); 
        obj2.info();
    }
}
