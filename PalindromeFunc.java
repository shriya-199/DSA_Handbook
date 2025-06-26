import java.util.*;
public class PalindromeFunc {
    public static boolean isPalindrome(int n)
    {
        int original = n;
        int reverseNum = 0;
        while(n>0)
        {
            int digit = n%10;
            reverseNum = (reverseNum*10)+digit;
            n = n/10;
        }
        return reverseNum == original;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        if(isPalindrome(n))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}
