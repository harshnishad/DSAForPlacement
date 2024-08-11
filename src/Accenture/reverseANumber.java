package Accenture;

class reverseANumber{
    public static void main(String[] args) {
        int num = 123456;
        int ans = 0;
        while(num>0){
           ans=ans*10+num%10;
           num=num/10; 
        }
        System.out.print(ans);
    }
}