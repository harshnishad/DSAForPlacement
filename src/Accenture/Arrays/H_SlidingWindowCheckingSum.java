package Accenture.Arrays;

public class H_SlidingWindowCheckingSum {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int sum = 33;

        System.out.println(naiveSolution(arr,arr.length,sum));
    }
    public static boolean naiveSolution(int[] arr, int n, int sum) {
        int start = 0;
        int SubArraySum = 0;
        for(int end = 0;end<n;end++) {
            SubArraySum += arr[end];

            while(SubArraySum>sum && start <= end){
                SubArraySum -= arr[start++];

            }
            if(SubArraySum == sum) {
                return true;
            }
        }
        return false;
    }
}
