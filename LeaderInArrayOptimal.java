import java.util.*;
public class LeaderInArrayOptimal {
    public static void main(String args[])
    {
        int[] arr = {12,22,10,3,0,6};
        int max = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();
        for(int i =arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                result.add(arr[i]);
            }
            max = Math.max(max,arr[i]);
        }
        for(int i : result)
        {
            System.out.println(i+" ");
        }
    }
}
