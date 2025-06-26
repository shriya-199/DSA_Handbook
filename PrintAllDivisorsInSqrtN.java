import java.util.*;
public class PrintAllDivisorsInSqrtN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i =1;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            if((n/i) != i)
            {
                System.out.println(n/i);
            }
        }
        }
    }
}
// Time Complexity: O(Sqrt(N))