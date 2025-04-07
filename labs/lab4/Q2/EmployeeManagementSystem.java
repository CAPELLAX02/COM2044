import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Full-Time Employee:");
        System.out.print("Enter your monthly salary: ");
        int monthlySalary = input.nextInt();
        System.out.print("Enter overtime hours: ");
        int overtimeHours = input.nextInt();
        System.out.print("Enter overtime rate: ");
        int overtimeRate = input.nextInt();
        double fullTimeSalary = calculateSalary(monthlySalary, overtimeHours, overtimeRate);
        System.out.println("Full-Time Employee Salary: " + fullTimeSalary + " TL");

        System.out.println();

        System.out.println("Part-Time Employee:");
        System.out.print("Enter your hourly rate: ");
        int hourlyRate = input.nextInt();
        System.out.print("Enter hours worked: ");
        int hoursWorked = input.nextInt();
        double partTimeSalary = calculateSalary(hourlyRate, hoursWorked);
        System.out.println("Part-Time Employee Salary: " + partTimeSalary + " TL");
    }

    // for full-time employees
    static double calculateSalary(int monthlySalary, int overtimeHours, int overtimeRate) {
        return monthlySalary + (overtimeHours * overtimeRate);
    }

    // for part-time employees
    static double calculateSalary(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}
