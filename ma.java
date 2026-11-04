class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double basicSalary;

    Employee(String name, int age, int employeeId, double basicSalary) {
        super(name, age);
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        System.out.println("Employee constructor");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, int age, int employeeId,
            double basicSalary, String department, double bonus) {
        super(name, age, employeeId, basicSalary);
        this.department = department;
        this.bonus = bonus;
        System.out.println("Manager constructor");
    }

    double calculateTotalSalary() {
        return basicSalary + bonus;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
public class ma
{
    public static void main(String[] args)
    {
        Manager m = new Manager(
                "Anu", 35, 101, 50000, "IT", 10000
        );

        System.out.println("\nManager Details:");
        m.display();
    }
}

