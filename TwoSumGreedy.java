import java.util.Arrays;

public class TwoSumGreedy {
    public static void main(String args[])
    {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        boolean found = false;
        Arrays.sort(arr);
        int i =0;
        int j = arr.length-1;
        int sum = 0;
        while(i<j)
        {
            sum = arr[i]+arr[j];
            if(sum<target)
            {
                i++;
            }
            else if(sum>target)
            {
                j--;
            }
            else
            {
                found = true;
                System.out.println("Indices: " + i + ", " + j);
                break; // Exit the loop once we find a pair
            }
        }
    }
}
// Time Complexity: O(n log n) for sorting, O(n) for the two-pointer traversal, overall O(n log n)
