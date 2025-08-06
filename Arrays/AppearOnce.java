package Arrays;

public class AppearOnce {
    public static void main(String args[])
    {
        int[] arr={1,2,3,2,3,1,4,7,4};
        int n = arr.length;
        /**Brute Force 
        for(int i=0;i<n;i++)
        {
            int num = arr[i];
            int cnt=0;
            for(int j =0;j<n;j++)
            {
                if(arr[j]==num)
                {
                    cnt++;
                }
            }
            if(cnt==1)
            {
                System.out.println(arr[i]);
            }
        }*/
        int xor =0;
        for(int i =0;i<n;i++)
        {
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
