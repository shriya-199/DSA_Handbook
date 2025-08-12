import java.util.*;
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,8,12,45,9};
        int n = arr.length;
        List<Integer> ansL = new ArrayList<>();
        /**Brute Force 
        for(int i =0;i<n;i++)
        {
            boolean ans=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    ans = false;
                    break;
                }
            }
            if(ans)
            {
                ansL.add(arr[i]);
            }
        }*/
        int max = Integer.MIN_VALUE;
        for(int i =n-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                ansL.add(arr[i]);
                max=arr[i];
            }
        }
        System.out.print(ansL);
    }
}
