import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Please enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int start = 0;
        int maxLength = 1;
        int tempStart = 0;
        int tempLength = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                tempLength++;
            } else {
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                    start = tempStart;
                }
                tempStart = i;
                tempLength = 1;
            }
        }

        if (tempLength > maxLength) {
            maxLength = tempLength;
            start = tempStart;
        }

        if (maxLength < 2) {
            System.out.println("No valid consecutive increasing subarray found.");
        } else {
            System.out.println("The Longest Consecutive Increasing Subarray is:");
            System.out.print("[");
            for (int i = start; i < start + maxLength; i++) {
                System.out.print(arr[i]);
                if (i < start + maxLength - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        scanner.close();
    }
}
