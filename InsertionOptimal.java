public class InsertionOptimal {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 5, 6, 7, 8};
        int[] arr2 = {2, 2, 3, 4, 6, 9};
        int i =0;
        int j =0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                j++;
            }
            else
            {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }
}
// Time Complexity: O(m+n)