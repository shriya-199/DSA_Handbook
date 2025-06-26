import java.util.*;
public class pattern5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = n;i>0;i--)
        {
            for(int j = i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}
