package Accenture;
public class subArrayWithLargestSum {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = 0;
        int sum = 0;
        int ans = 0;
        for(int i:arr){
            sum+=i;
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
            
        }
        System.err.println(ans);
    }
}
