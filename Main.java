/*Employee Management system using inheritance*/

class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Base Salary: " + salary);
    }

    void calculateSalary() {
        System.out.println("Total Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    void calculateSalary() {
        double total = salary + bonus;
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + total);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int employeeId, double salary,
                     int hoursWorked, double hourlyRate) {
        super(name, employeeId, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    void calculateSalary() {
        double total = hoursWorked * hourlyRate;
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee("Deb", 101, 30000, 5000);
        System.out.println("--- Full Time Employee ---");
        e1.displayDetails();
        e1.calculateSalary();

        System.out.println();

        PartTimeEmployee e2 = new PartTimeEmployee("Raj", 102, 0, 80, 200);
        System.out.println("--- Part Time Employee ---");
        e2.displayDetails();
        e2.calculateSalary();
    }
}