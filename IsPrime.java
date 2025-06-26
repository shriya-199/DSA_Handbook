import java.util.*;
public class IsPrime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int noOfDivisors =0;
        if(n == 1) System.out.print("Neither Prime nor Composite");
        for(int i =1;i<Math.sqrt(n);i++)
        {
            if((n%i) == 0)
            {
                noOfDivisors++;
                if((n/i)!=i)
                {
                    noOfDivisors++;
                }
            }
        }
        if(noOfDivisors == 2)
        {
            System.out.print("Prime");
        }
        else{
            System.out.println("No.!!!");
        }
    }
}
