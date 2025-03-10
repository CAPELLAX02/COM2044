import java.time.Year;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentYear = Year.now().getValue();

        System.out.print("Birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        int age = currentYear - birthYear;
        double taxRate = 0.0;

        if (age < 18)
            taxRate = 0.0;
        else if (age < 30)
            taxRate = 0.10;
        else if (age < 50)
            taxRate = 0.20;
        else
            taxRate = 0.30;

        double taxAmount = (salary * taxRate);
        double netSalary = salary - taxAmount;

        System.out.println("Your age: " + age + " years");
        System.out.println("Tax rate: " + taxRate * 100 + "%");
        System.out.println("Tax deduction: " + (int) taxAmount + " TL");
        System.out.println("Net salary: " + (int) netSalary + " TL");

        scanner.close();
    }
}