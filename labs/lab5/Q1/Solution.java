import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Please enter " + size + " elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        countFrequenciesInArray(arr);
    }
    static void countFrequenciesInArray(int[] arr) {
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freq[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        System.out.println("Element Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.println(i + " appears " + freq[i] + " time.");

            }
            else if (freq[i] > 0) {
                System.out.println(i + " appears " + freq[i] + " times.");
            }
        }
    }
}
