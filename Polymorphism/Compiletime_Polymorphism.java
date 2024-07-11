// Also known as Static binding -> occurs when the method to be invoked is resolved at compile time. 
// This type of polymorphism is achieved through method overloading.
// Method overloading is -> Methods having the same name but different parameters 

class A { 
    int a; 
    int b; 
    int c; 

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}


public class Compiletime_Polymorphism {
    public static void main(String[] args) {
        A obj = new A(); 

        obj.sum(1, 2);           // Calls sum(int a, int b) and prints 3
        obj.sum(1, 2, 3);        // Calls sum(int a, int b, int c) and prints 6
        obj.sum(1.5, 2.5);       // Calls sum(double a, double b) and prints 4.0
    }
}

