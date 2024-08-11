package Accenture.Arrays;
import Accenture.Arrays.printArray;

public class B_MoveZeroToRight {
    public static void main(String[] args) {
        int arr[] = {1,0,0,2,10,0,9,0};

        int n = ZeroToEnd(arr);
        printArray.print(arr,n);

    }
    public static int ZeroToEnd(int arr[]){
        int i = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0) {
                arr[i++] = arr[j];
            }
        }
        return i;
    }
}
