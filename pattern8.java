import java.util.*;
class pattern8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = n;i>=1;i--)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k <= (2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}