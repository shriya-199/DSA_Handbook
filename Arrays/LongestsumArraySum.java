public class LongestsumArraySum {
        public static void main(String[] args) {
            int[] arr ={1,1,1,12,6,6,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
            int target = 12;
            int n = arr.length;
            int length=0;
            // /**Better 
            // for(int i =0;i<n;i++)
            // {
            //     int sum =0;
            //     for(int j = i;j<n;j++)
            //     {
            //         /**Brute Force 
            //         int sum =0;
            //         for(int k = i;k<j;k++)
            //         {
            //             sum+=arr[k];
            //         }*/
            //         sum+=arr[j];
            //         if(sum==target)
            //         {
            //             length=Math.max(length,j-i+1);
            //         }
            //     }
            // }*/
            int i =0;
            int j = 0;
            int sum =arr[0];
            while(j<n)
            {
                while(i<=j && sum>target)
                {
                    sum-=arr[i];
                    i++;
                }
                if(sum==target)
                {
                    length=Math.max(length,j-i+1);
                }
                if(j<n)
                {
                    sum+=arr[j];
                    j++;
                }
            }
            System.out.println(length);
        }    
}