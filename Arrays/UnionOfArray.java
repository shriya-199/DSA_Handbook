package Arrays;
import java.util.*;
public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,7,8,9,12};
        int[] arr2 ={1,4,6,8,20};
        Set<Integer> ans = new LinkedHashSet<>();
        /**Brute Force 
        for(int i: arr1)
        {
            ans.add(i);
        }
        for(int i: arr2)
        {
            ans.add(i);
        }
        for(int i:ans)
        {
            System.out.println(i);
        }*/
        int i = 0, j = 0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                ans.add(arr1[i]);
                i++;
            }
            else
            {
                ans.add(arr2[j]);
                j++;
            }
        }
        while(j<arr2.length)
        {
            ans.add(arr2[j]);
            j++;
        }
        while(i<arr1.length)
        {
            ans.add(arr1[i]);
            i++;
        }
        for(int k:ans)
        {
            System.out.println(k);
        }
    }
}
