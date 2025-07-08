public class DutchNationalFlag {
    public static void swap(int[] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String args[])
    {
        int arr[] = {1, 0, 2, 1, 0, 2, 1, 0};
        int low =0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<high)
        {
            if(arr[mid] == 0) 
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,high);
                high--;

            }
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
// // Time Complexity: O(n)