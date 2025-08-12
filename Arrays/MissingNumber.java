

public class MissingNumber {
    public static void main(String args[])
    {
        int[] arr={2,4,3,7,8,6,5};
        int n = arr.length+1;
        /**Brute Force 
        for(int i =1;i<=n;i++)
        {
            int flag=0;
            for(int j =0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                {
                    System.out.print(i);
                    break;
                }
        }*/
        /**Better 
        int[] hashArray = new int[n+1];
        for(int i =0;i<n;i++)
        {
            if(arr[i]<=n)
            hashArray[arr[i]]=1;
        }
        for(int i =1;i<=n;i++)
        {
            if(hashArray[i]==0)
            {
                System.out.print(i);
                break;
            }
        }*/
        int sumN = (n*(n+1))/2;
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sumN-sum);
        int xor1=0;
        int xor2=0;
        for(int i =0;i<arr.length;i++)
        {
            xor1=xor1^arr[i];
            xor2=xor2^(i+1);
        }
        xor2=xor2^n;
        System.out.println(xor1^xor2);
    }
}
