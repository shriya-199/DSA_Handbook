import java.util.*;
public class TwoSumHashing {
    public static void main(String arge[])
    {
        int[] arr = {1, 3, 4, 5};
        int target = 6;
        Map<Integer,Integer> set = new HashMap<>();
        boolean found = false;
        for(int i =0;i<arr.length;i++)
        {
            int a = arr[i];
            int next = target - a;
            if(set.containsKey(next))
            {
                found = true;
                System.out.println("Indices: " + set.get(next) + ", " + i);
            }
            else
            {
                set.put(a, i);
            }
           
        }
    }   
}
// Time Complexity: O(n)
