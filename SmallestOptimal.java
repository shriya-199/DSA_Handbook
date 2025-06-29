import java.util.*;
public class SmallestOptimal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int smallest = arr[0];
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i =1;i<n;i++)
        {
            smallest = Math.min(arr[i],smallest);
        }
        System.out.print(smallest);
    }
}
// Time Complexity: O(N)
