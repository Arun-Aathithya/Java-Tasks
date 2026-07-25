class Emp{
    int empId;
    String name;
    double salary;

    Emp(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Emp {
    String department;

    Manager(int empId, String name, double salary, String department) {
        super(empId, name, salary);
        this.department = department;
    }

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

class Developer extends Emp {
    String programmingLanguage;

    Developer(int empId, String name, double salary, String programmingLanguage) {
        super(empId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void showLanguage() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Inherit_Task {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Alice", 80000, "HR");
        Developer d = new Developer(102, "Bob", 70000, "Java");

        System.out.println("Manager Details");
        m.displayDetails();
        m.showDepartment();

        System.out.println();

        System.out.println("Developer Details");
        d.displayDetails();
        d.showLanguage();
    }
}