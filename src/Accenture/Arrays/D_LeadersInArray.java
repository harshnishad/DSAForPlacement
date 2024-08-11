package Accenture.Arrays;

public class D_LeadersInArray {
    public static void main(String[] args) {
        int[] arr1 = {7,10,4,3,6,5,2};
        //nativeApproach(arr1);

        optimizeApproach(arr1);
    }
    public static void nativeApproach(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for(int j = i+1; j < arr.length; j++) {
                if(curr < arr[j]) {
                    curr = arr[j];
                    break;
                }
            }
            if(curr == arr[i]) {
                System.out.println(curr);
            }
        }
    }
    public  static void optimizeApproach(int[] arr) {
        int n = arr.length-1;
        int leader = arr[n];
        System.out.println(leader);
        for(int i = n-1 ;i>=0;i--){
            if(leader<arr[i]){
                leader = arr[i];
                System.out.println(leader);
            };
        }
    }

}
