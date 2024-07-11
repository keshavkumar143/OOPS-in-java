//Multi level inhertitance 
// Base class <- Intermediate class <- child class 

class A {
    int Employee_id;

    A(int Employee_id) {
        this.Employee_id = Employee_id;
    }

    void displayEmployeeId() {
        System.out.println("Employee ID: " + Employee_id);
    }
}

class B extends A {
    String Employee_name;

    B(String Employee_name, int Employee_id) {
        super(Employee_id);
        this.Employee_name = Employee_name;
    }

    void displayEmployeeName() {
        System.out.println("Employee Name: " + Employee_name);
    }
}

class C extends B {
    String Department;

    C(String Employee_name, int Employee_id, String Department) {
        super(Employee_name, Employee_id); // Accesing Intermediate and Base class
        this.Department = Department;
    }

    void displayDepartment() {
        System.out.println("Department: " + Department);
    }

    void displayDetails() {
        System.out.println("Over All Details : " + Employee_id + " " + Employee_name + " " + Department);
    }
}

public class Multi_level_Inheritance {
    public static void main(String[] args) {

        C obj = new C("Keshav", 12345, "IT");

        obj.displayEmployeeId();
        obj.displayEmployeeName();
        obj.displayDepartment();
        obj.displayDetails();
    }
}
