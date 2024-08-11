package Accenture;

public class findLargestNoInArray {
    public static void main(String[] args) {
        int arr[] = {10,20,19,70,35,257,165,727};
        int max = 0;
        for(int i:arr){
            max = Math.max(i,max);
        }
        System.out.print(max);
    }
}
