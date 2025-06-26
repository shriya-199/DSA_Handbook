import java.util.*;
public class ReverseANumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Reversed Number: ");
        int reverseNum = 0;
        while(n>0)
        {
            int digit = n%10;
            reverseNum = (reverseNum*10)+digit;
            n = n/10;
        }
        System.out.print(reverseNum);
    }
}
