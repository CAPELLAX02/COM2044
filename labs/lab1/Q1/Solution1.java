import java.util.Scanner;

/**
 * COM2044 LAB1 Q1
 * Ahmet ATAR - 22290230
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a grade between 0 and 100: ");
        int grade = scanner.nextInt();
        String letterGrade;

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade entered.");
            return;
        }

        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Grade: " + letterGrade);

        scanner.close();
    }
}