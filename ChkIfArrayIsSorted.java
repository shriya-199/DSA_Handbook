import java.util.*;
public class ChkIfArrayIsSorted {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        boolean isSorted = true;
        for(int i =1;i<n;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                isSorted = true;
            }
            else
            {
                isSorted = false;
            }
        }
        if(isSorted)
        {
            System.out.print("Sorted!!!");
        }
        else
        {
            System.out.print("NOOOO!!!");
        }
    }
}
