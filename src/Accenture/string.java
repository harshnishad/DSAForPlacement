//the function accepts a string str as its argument.the function needs to return the transformed string by replacing all occurence of the character 'a' with the character 'b' and vice versa 
// str -> abaabbcc  output -> babbaacc
package Accenture;

public class string {
    public static void main(String[] args) {
        String str = "abaabbcc";
        String ans = "";
        for(char ch : str.toCharArray()){
            if(ch=='a') ans+="b";
            else if(ch=='b') ans+="a";
            else ans+=ch;
        }
        System.err.println(ans);
    }
}
