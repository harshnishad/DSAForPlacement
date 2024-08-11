package Accenture;

public class findMissingNo {
    public static void main(String[] args) {
        int arr[] = {0,2,3};
        int lenArray = 3;
        int sum = (lenArray)*(lenArray+1)/2;
        int ans = 0;
        for(int i:arr){
            ans+=i;
        }
        System.err.println(sum-ans);
    }
}
