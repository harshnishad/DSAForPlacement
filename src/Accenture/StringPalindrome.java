package Accenture;
// --> aba  -->true;
public class StringPalindrome {
    public static void main(String[] args) {
        String s = "ababa";
        char ch[] = s.toCharArray();
        int n=s.length();//length
        boolean ans = true;
        for(int i=0;i<n/2;i++){
          if(ch[i]!=ch[n-i-1]){
            ans = false;
            break;
          }
        }
        System.out.println(ans);
    }
}
