import java.util.*;
public class MissingNumberUsingHashing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6}; // Example array with a missing number
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++)
        {
            set.add(arr[i]);
        }
        for(int i =1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                System.out.print(i);
                break;
            }
        }
    }       
}
// Time Complexity: O(n)