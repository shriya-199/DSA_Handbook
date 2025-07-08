import java.util.HashMap;
import java.util.Map;

public class MajorityElementByHashing {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 1, 1, 1, 2, 3};
        int n = arr.length;
        int k = n / 2;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : arr)
        {
            mp.put(i,mp.getOrDefault(i, 0) + 1);
            if(mp.get(i)>k) {
                System.out.println(i);
                return;
            }
        }
    }
}
// Time Complexity: O(n)
