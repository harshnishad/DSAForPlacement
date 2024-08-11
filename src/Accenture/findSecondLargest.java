package Accenture;

public class findSecondLargest {
    public static void main(String[] args) {
        int n[] ={10,2,39,70,5,3};
        int largest = largestInArray(n);
        System.out.println(SecondLargest(n,largest));
    }
    public static int largestInArray(int[] arr) {
        int largest = 0;
        for(int i : arr ) {
            largest = Math.max(largest,i);
        }
        return largest;
    }
    public static int SecondLargest(int[] arr ,int k){
        int largest = 0;
        for(int i:arr){
            if(i==k) continue;
            largest = Math.max(largest,i);
        }
        return largest;
    }

}
