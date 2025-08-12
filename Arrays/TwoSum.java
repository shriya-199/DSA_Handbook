import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int target = 11;
        int n = arr.length;
        /**Brute Force 
        for(int i =0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print(i+" "+j);
                    break;
                }
            }
        }*/
        /**Better 
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            ans.put(arr[i],i);
        }
        for(int i =0;i<arr.length;i++)
        {
            int a = arr[i];
            int next = target-a;
            if(ans.containsKey(next) && ans.get(next)!=i)
            {
                System.out.print(i+" "+ans.get(next));
                break;
            }
           
        }*/
        Arrays.sort(arr);
        int i =0;
        int j = n-1;
        while(i<=j)
        {
            if(arr[i]+arr[j]==target)
            {
                System.out.println(i+" "+j);
                break;
            }
            else if(arr[i]+arr[j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }


    }
}
