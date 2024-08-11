package Accenture.Arrays;

public class I_Equilibrium {
    public static void main(String[] args) {
        /**
         * arr[] = {3,4,8,-9,20,6}
         * OP : YES
         * arr[] = {4,2,2}
         * OP : NO
         * Highest number in the array should have both left & right side must be lower than that.
         **/
        int arr[] = {-7, 1, 5, 2, -4, 3, 0} ;
        System.out.println(optimisedSol(arr));
    }
    public static int optimisedSol(int[] arr) {
        int sum = 0;
        int lSum = 0;
        for(int i:arr){
            sum += i;
        }
        for(int i = 0; i < arr.length; i++) {
            sum -= arr[i];

            if(sum == lSum){
                return i;
            }
            lSum += arr[i];
        }
        return -1;
    }
}
