import java.util.*;
public class Intersection {
    public static void main(String args[])
    {
        int[] arr1 = {1, 2, 2, 3, 5, 6, 7, 8};
        int[] arr2 = {2, 2, 3, 4, 6, 9};
        int visited[] = new int[arr1.length + arr2.length];
        List<Integer> resultList = new ArrayList<>();
        for(int i =0;i<arr1.length;i++)
        {
            for(int j =0;j<arr2.length;j++)
            {
                if(arr1[i] ==arr2[j] && visited[j] == 0)
                {
                    resultList.add(arr1[i]);
                    visited[j] = 1;
                    break; 
                }
                if(arr2[j]>arr1[i])
                {
                    break;
                }
            }
        }
        for(int  i : resultList)
        {
            System.out.print(i + " ");
        }

    }
}
// Time Complexity: O(m*n)