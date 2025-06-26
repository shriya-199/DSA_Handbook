import java.util.*;
class pattern3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        for(int i = 1;i<=number;i++)
        {
            for(int j = 1;j<i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
