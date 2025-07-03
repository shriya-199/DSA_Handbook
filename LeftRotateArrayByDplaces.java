import java.util.*;
public class LeftRotateArrayByDplaces {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter d:");
        int d = sc.nextInt();
        d = d%n;
        int[] temp = new int[d];
        for(int i = 0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        int j=0;
        for(int i =d;i<n;i++)
        {
            arr[i-d] = arr[i];
        }
        for(int i =n-d;i<n;i++)
        {
            arr[i] = temp[j];
            j++;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
// Time Complexity: O(n)
// Space Complexity: O(d)