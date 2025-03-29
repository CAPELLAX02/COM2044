import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        for (int row = 1; row <= height; row++) {
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
