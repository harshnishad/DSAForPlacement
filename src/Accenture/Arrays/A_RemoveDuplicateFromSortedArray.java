package Accenture.Arrays;
import  Accenture.Arrays.printArray;
public class A_RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int n[] = {1,1,1,2,3,3,3,4,5,5,5,6,6,7};
        int total = removeDuplicate(n);
        System.out.println(total);


    }
    public static int removeDuplicate(int[] nums) {
        int j = 0;
        int prev =Integer.MIN_VALUE;
        for(int i = 0 ;i<nums.length;i++){
            if(prev == nums[i]){
                continue;
            }
            else{
                prev = nums[i];
                nums[j++]=prev;
            }
        }
        return j;
    }
}
