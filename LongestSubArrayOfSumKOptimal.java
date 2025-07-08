public class LongestSubArrayOfSumKOptimal {
    public static void main(String args[])
    {
        int[] arr ={1,2,3,1,4,2,3};
        int k = 5;
        int length =0;
        int n = arr.length;
        int sum = 0;
        int left =0;
        int right =0;
        while(right<n)
        {
            sum += arr[right];
            while(left<=right && sum>k)
            {
                sum -= arr[left];
                left++;
            }
            if(sum == k)
            {
                length = Math.max(length, right-left+1);
            }
            right++;
        }
        System.out.println(length);
    }
}
