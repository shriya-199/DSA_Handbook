import java.util.*;
public class Union {
    public static void main(String args[])
    {
        int arr1[] = {1,2,5,1,6};
        int arr2[] = {1,5,7,9,2,0,3};
        Set<Integer> st= new HashSet<>();
        for(int i =0;i<arr1.length;i++)
        {
            st.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++)
        {
            st.add(arr2[i]);
        }
        for(int i:st)
        {
            System.out.print(i+" ");
        }
    }
}
// Time Complexity : O(m+n); where m and n are size of arr1 and arr2 respectively.!
