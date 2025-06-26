import java.util.*;
class hcf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        int gcd =1;
        for(int i = 1;i<=Math.max(n1,n2);i++)
        {
            if(n1%i == 0 && n2%i==0)
            {
                gcd = i;
            }
        }
        System.out.print(gcd);

    }
}
// Time Complexity: O(min(n1,n2))