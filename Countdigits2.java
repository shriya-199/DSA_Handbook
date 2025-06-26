import java.util.*;
public class Countdigits2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = (int)(Math.log10(n)+1);
        System.out.println("No. of digits in n = "+count);
    }
}
