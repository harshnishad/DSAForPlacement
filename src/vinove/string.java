public class string {
    public static void main(String[] args) {
        String s = "madam";
        System.err.println(checker(s));

    }
    static boolean checker(String s){
        int n = s.length();
         boolean ans = false;
        for(int i = 0;i<n/2;i++){
            if(s.charAt(i) == s.charAt(n-i-1)){
                ans = true;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }
}
