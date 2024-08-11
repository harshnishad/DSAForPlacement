public class Recursion {
    public static void main(String[] args) {
        String s = "bca";
        permute(s.toCharArray(), 0, s.length() - 1);
    }

    static void permute(char[] s, int l, int r) {
        if (l == r) {
            System.out.println(new String(s));
        } else {
            for (int i = l; i <= r; i++) {
                swap(s, l, i);
                permute(s, l + 1, r);
                swap(s, l, i); 
            }
        }
    }

    private static void swap(char[] s, int l, int r) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
}
