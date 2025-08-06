package Arrays;

import java.lang.reflect.Array;
import java.util.*;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        System.out.println("Array before removing duplicates: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after removing duplicates: ");
        int i =0;
        int n = arr.length;
        for(int j =1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        for(int k =0;k<=i;k++)
        {
            System.out.print(arr[k] + " ");
        }
    }

}

