import java.util.*;
public class pattern9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i =0;
        for(i=i;i<=n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int k = n-1;k>=1;k--)
            {
                for(int w=k;w>0;w--)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
}
