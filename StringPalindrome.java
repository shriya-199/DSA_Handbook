public class StringPalindrome {
    boolean isPalindrome(int i,String s)
    {
        if(i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return isPalindrome(i+1,s);
    }
    public static void main(String args[])
    {
        String s = "MADM";
        StringPalindrome sp = new StringPalindrome();
        if(sp.isPalindrome(0,s)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }
}
