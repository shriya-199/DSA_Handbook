import java.util.*;
public class LargestElementOptimalApproach {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        int greatest = arr[0];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i =1;i<n;i++)
        {
            greatest = Math.max(greatest,arr[i]);
        }
        System.out.println(greatest);
    }
}
// Time Complexity: O(N)