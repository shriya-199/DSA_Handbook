package Arrays;
class Solution
{
    public static boolean isSorted(int[] arr)
    {
        int n = arr.length;
        boolean ans = true;
        for(int i =1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                ans = false;
                break;
            }
        }
        if(ans)
        {
            return true;
        }
        return false;
    }
}

public class IsSorted {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted? " + Solution.isSorted(arr));
        
        int[] arr2 = {5, 3, 2, 4, 1};
        System.out.println("Is the array sorted? " + Solution.isSorted(arr2));
    }
    
}
