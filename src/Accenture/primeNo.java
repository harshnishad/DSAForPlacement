package Accenture;

public class primeNo {
    public static void main(String[] args) {
        
        int n = 11111;
        if(n<1)System.out.println(false);
        boolean ans = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) {
               ans = false;
               break;
            }
        }
        System.out.println(ans);
    }
}
