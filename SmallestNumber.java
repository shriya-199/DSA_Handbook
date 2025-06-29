import java.util.*;
public class SmallestNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]);
    }
}
// Time Complexity: O(NlogN)