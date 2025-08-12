public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,3};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // /**Better Sol 
        // for(int i =0;i<n;i++)
        // {
        //     int sum =0;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         /**Brute Force 
        //         int sum =0;
        //         for(int k = i;k<=j;k++)
        //         {
        //             sum+=arr[k];
        //             max= Math.max(max,sum);
        //         }*/
        //         sum+=arr[j];
        //         max =Math.max(max,sum);
        //     }
        // }*/
        /**Kadane's Algo */
        for(int i =0;i<n;i++)
        {
            sum+=arr[i];
            if(sum<0)
            {
                sum=0;
            }
            else
            {
                max=Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}
