import java.util.*;
public class UnionOptimal {
    public static void main(String[] args) {
        int arr1[] ={1,1,2,3,5,6};
        int arr2[] ={1,7,8};
        int i =0;
        int j =0;
        List<Integer> resultList = new ArrayList<>();
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                if(resultList.size() == 0 || resultList.get(resultList.size()-1)!=arr1[i])
                {
                resultList.add(arr1[i]);
}
            i++;
        }
            else
            {
                if(resultList.size() == 0 || resultList.get(resultList.size()-1)!=arr2[j])
                {
                    resultList.add(arr2[j]);
                }
                j++;
            }
        }
        while(j<arr2.length)
        {
         if(resultList.size() == 0 || resultList.get(resultList.size()-1)!=arr2[j])
                {
                    resultList.add(arr2[j]);
                }
                j++;   
        }
        while(i<arr1.length)
        {
            if(resultList.size() == 0 || resultList.get(resultList.size()-1)!=arr1[i])
                {
                    resultList.add(arr1[i]);
                }
            i++;
        }
        for(int k:resultList)
        {
            System.out.print(k+" ");
        }
    }
}
// TimeComplexity: O(m+n) 