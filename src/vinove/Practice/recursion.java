class recursion{
    public static void main(String[] args) {
      String s = "abc";
      helper(s,"");
    }
    public static void helper(String s,String ans){
      if(s.length()==0){
         System.err.println(ans);
         return;
      }
      helper(s.substring(1), ans+s.charAt(0));
      helper(s.substring(1), ans);
    }
}