class Employee {
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    private double allowance;
    private double bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {
        super(id, name, salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                     int hoursWorked, double hourlyRate) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Employeetest {
    public static void main(String[] args) {
        Employee[] employees = {
                new PermanentEmployee(101, "Anu", 30000, 5000, 2000),
                new ContractEmployee(102, "Ravi", 0, 160, 200)
        };

        for (Employee e : employees) {
            e.display();
            System.out.println();
        }
    }
}
