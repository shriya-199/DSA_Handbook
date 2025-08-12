
import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        int[] arr2 ={2,4,5,6};
        Set<Integer> ans = new LinkedHashSet<>();
         /**Brute Force 
        int[] visited = new int[arr1.length];
       
        for(int i =0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j] && visited[j]==0)
                {
                    ans.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                if(arr1[i]<arr2[j])break;
            }
        }*/
        int i=0;
        int j =0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else
            {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        for(int k:ans)
        {
            System.out.print(k+" ");
        }
    }
}
