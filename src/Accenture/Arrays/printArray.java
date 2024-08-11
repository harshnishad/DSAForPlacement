package Accenture.Arrays;

public class printArray {
    public static void main(String[] args) {
//        // Test the print method
//        int[] sampleArray = {1, 2, 3, 4, 5};
//        print(sampleArray);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print a newline after the array for better readability
        System.out.println();
    }
    public static void print(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print a newline after the array for better readability
        System.out.println();
    }
}
