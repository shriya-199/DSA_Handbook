public class MaximumSubArraySum {
    public static void main(String args[])
    {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            for(int j =i;j<arr.length;j++)
            {
                int sum =0;
                for(int k =i;k<=j;k++)
                {
                    sum+= arr[k];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
// Time Complexity: O(n^3)
