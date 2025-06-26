import  java.util.*;
public class LargestArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0;i<n;i++)
        {
            System.out.print("Largest element:"+arr[n-1]);
        }
    }
}
// This is the Brute Force Approach
// Time Complexity: O(NlogN)