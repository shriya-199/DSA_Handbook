import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int reverseNum = 0;
        int originalNum = n;
        while(n>0)
        {
            int digit = n%10;
            reverseNum = (reverseNum*10)+digit;
            n = n/10;
        }
        if(reverseNum == originalNum)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
