public class Solution7_1 {
    public static void main(String[] args) {
        Company company = new Company();

        Employee m1 = new Manager("Alice", 10000);
        Employee m2 = new Manager("Bob", 12000);
        Employee d1 = new Developer("Charlie", 8000);
        Employee d2 = new Developer("David", 9500);

        company.addEmployee(m1);
        company.addEmployee(m2);
        company.addEmployee(d1);
        company.addEmployee(d2);

        company.printAllBonuses();
    }
}

abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class Company {
    Employee[] employees = new Employee[10];
    int count = 0;

    void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        }
    }

    void printAllBonuses() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].name + " - Salary: " + employees[i].salary + " - Bonus: " + employees[i].calculateBonus());
        }
    }
}