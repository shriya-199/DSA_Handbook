import java.util.*;
public class ArmStrong {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        while(n>0)
        {
            int digit = n%10;
            sum += Math.pow(digit,3);
            n=n/10;
        }
        if(original == sum)
        {
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("No.!!");
        }
    } 
}
