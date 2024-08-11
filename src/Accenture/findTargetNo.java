package Accenture;

public class findTargetNo {
    public static void main(String[] args) {
        int arr[] = {2,3,4,10,40};
        int k = 2;
        
        boolean ans = false;
        int start = 0;
        int end  = arr.length-1;

        while(start<=end){
            int mid =  start+(end-start)/2;
            if(arr[mid]==k){
                ans = true;
                break;
            }
            else if(arr[mid]<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(ans);

    }
}
