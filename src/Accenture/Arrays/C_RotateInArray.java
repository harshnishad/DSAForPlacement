package Accenture.Arrays;

public class C_RotateInArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int k = 2;
        printArray.print(arr1);
         arr1 = leftRotate(arr1,k);
        printArray.print(arr1);
        int arr[] = {1,2,3,4,5};
        printArray.print(arr);
        arr =  rightRotate(arr,k);
        printArray.print(arr);
    }
    public static int[] leftRotate(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, k-1 );
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        return arr;
    }

    public static int[] rightRotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        return arr;
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
