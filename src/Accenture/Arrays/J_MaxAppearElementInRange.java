package Accenture.Arrays;

public class J_MaxAppearElementInRange {
    public static void main(String[] args) {
        int[] l = {1,4,3,1};
        int[] r = {15,8,5,4};
        int max = 15; //find max
        System.out.println(maxOccured(l.length,l,r,max));
    }
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int arr[] = new int[maxx+1];
        for(int i = 0;i<n;i++){
            addRange(arr,l[i],r[i]);
        }
        int max = 0;
        for(int i : arr){
            max = Math.max(i,max);
        }

        for(int i=0;i<maxx;i++){
            if(arr[i]==max){
                return i;
            }
        }
        return -1;
    }
    public static void addRange(int arr[] ,int start ,int end){
        for(int i=start ;i<=end;i++){
            arr[i]++;
        }
    }
}
