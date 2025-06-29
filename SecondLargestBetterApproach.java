// Better Approach

import java.util.*;
public class SecondLargestBetterApproach {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        int largest = arr[0];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i =1;i<n;i++)
        {
            largest = Math.max(largest,arr[i]);
        }
        int sdLargest = -1;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]>sdLargest && arr[i]!=largest)
            {
                sdLargest = arr[i];
            }
        }
        System.out.print(sdLargest);
    }
}
