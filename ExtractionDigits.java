import java.util.*;
public class ExtractionDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Numbers from right to left are: ");
        while(n!=0)
        {
            System.out.println(n%10);
            n = n/10;

        }
    }
    
}
