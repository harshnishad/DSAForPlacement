public class subArray {
    public static void main(String[] args) {
        int arr[] = {34, -50, 42, 14, -5, 86};
        int ans = Integer.MIN_VALUE;
        int sum  = 0;
        int start = 0;
        for(int end = 0 ;end < arr.length;end++){
             sum += arr[end];
              ans = Math.max(ans,sum);
             if(sum<0){
               sum-=arr[start++];
             }
        }
        System.err.println(ans);
    }
}
