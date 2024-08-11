package Accenture.Arrays;

public class F_Q_MaxLenEvenOdd {
    public static void main(String[] args) {
        /**
         * IP : {10,12,14,7,8}
         * 10 - even
         * 12 - even
         * 14 - even
         * 7 - odd
         * 8 - even
         * Maximum even-odd sequence is 3 (14,7,8) it must be alternative
         * OP : 3
         **/
        int[] arr = {10,12,14,7,8};
        System.out.println(effective(arr));
    }
    public static int effective(int[] arr) {
        boolean odd = false;
        boolean even = false;
        int ans = 1;
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
             if(arr[i] % 2 == 0 && arr[i-1]%2!=0 ||arr[i] % 2 != 0 && arr[i-1]%2==0) {
                 count++;
                 ans = Math.max(ans, count);
             }

        }
        return ans;
    }
}
