// Brute Force

import java.util.*;
class SecondLargest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sdLargest = arr[n-1];
        for(int i = n-2;i>=0;i--)
        {
            if(sdLargest != arr[i])
            {
                sdLargest = arr[i];
                break;
            }
        }
        System.out.print(sdLargest);
    }
}
// Time Complexity: O(NlogN)+O(N)