public class MoveZerosToEndOptimal {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,0,0,4,50,0,1,0,9,0};
        int n = arr.length;
        int j =-1;
        for(int i =0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                j = i;
                break;
            }
        }
        for(int i = j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                swap(arr,i,j);
                j++;
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
