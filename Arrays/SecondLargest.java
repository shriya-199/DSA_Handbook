
import java.util.*;
class BruteForce
{
    public static int sdlargest(int[] arr)
    {
        int n = arr.length;
        Arrays.sort(arr);
        int sdlargest = arr[n-1];
        for(int i =n-2;i>=0;i++)
        {
            if(arr[i] !=arr[n-1])
            {
                sdlargest = arr[i];
                break;
            }
        }
        return sdlargest;
    }
}
class Better
{
    public static int sdlargest(int[] arr)
    {
        int n = arr.length;
        int largest =arr[0];
        int sdlargest =-1;
        for(int i =1;i<n;i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        for(int i =1;i<n;i++)
        {
            if(arr[i]>sdlargest && arr[i]!= largest)
            {
                sdlargest = arr[i];
            }
        }
        return sdlargest;
    }
}
class Optimal
{
    public static int sdlargest(int[] arr)
    {
        int n = arr.length;
        int largest = arr[0];
        int sdlargest = -1;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                sdlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>sdlargest){
                sdlargest = arr[i];
            }
        }

        return sdlargest;
    }
}

public class SecondLargest {
    public static void main(String[] args)
    {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest in given array via Brute Force is: " + BruteForce.sdlargest(arr));
        System.out.println("Second Largest in given array via Better Approach is: " + Better.sdlargest(arr));
        System.out.println("Second Largest in given array via Optimal Approach is: " + Optimal.sdlargest(arr));
    }
    
}
