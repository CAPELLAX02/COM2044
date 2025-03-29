import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of diamond: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println("*");
            }
            else {
                System.out.print("*");
                for (int space = 1; space <= 2 * i - 3; space++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
            }
            else {
                System.out.print("*");
                for (int space = 1; space <= 2 * i - 3; space++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        scanner.close();
    }
}
