interface print {
    void printable(); 
}

class A implements print { 
    @Override
    public void printable() {
        System.out.println("A");
    }
}

class B implements print  {
    @Override
    public void printable() {
        System.out.println("B");
    }
}

public class Interface_example {
    public static void main(String[] args) {
        print a = new A();
        print b = new B();
        a.printable();
        b.printable();
    }
}
