public class LongestSubArrayOfSumK {
    public static void main(String args[])
    {
        int length =0;
        int[] arr ={1,2,3,1,4,2,3};
        int k = 5;
        for(int i =0;i<arr.length;i++)
        {
            int sum = 0;
            for(int j =i;j<arr.length;j++)
            {
                sum +=arr[j];
                if(sum == k) length = Math.max(length, j-i+1);
            }
        }
        System.out.println(length);
    }
}
// Time Complexity: O(n^2)
