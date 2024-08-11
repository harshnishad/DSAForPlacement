package Accenture.Arrays;

public class G_MaximumCircularSumArray {
    public static void main(String[] args) {
        int arr[] = {7,-3,1,4,6};
        System.out.println(optimised(arr));
    }
    static int optimised(int[] arr) {
        int max_normal = standerdKardensAlgo(arr);
        if(max_normal<0) return max_normal;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int circular_sum = sum + standerdKardensAlgo(arr);
        return Math.max(circular_sum,max_normal);
    }
    static int standerdKardensAlgo(int[] arr) {
        int ans = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            ans = Math.max(ans, sum);
        }
        return ans;
    }

}
