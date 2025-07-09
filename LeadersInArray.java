import java.util.*;
public class LeadersInArray {
    public static void main(String args[])
    {
        int[] arr = {10,22,12,3,0,6};
        List<Integer> result = new ArrayList<>();
        for(int i =0;i<arr.length;i++)
        {
            boolean leader = true;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i]) 
                {leader = false; break;}
            }
            if(leader==true) result.add(arr[i]);
        }
        for(int x : result)
        {
            System.out.print(x+" ");
        }
    }
}
