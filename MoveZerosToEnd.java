public class MoveZerosToEnd {
    public static void main(String[] args)
    {
        int[] arr = {0,1,0,5,6,8,9,0};
        int n = arr.length;
        int temp[] = new int[n];
        int k =0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i =0;i<temp.length;i++)
        {
            arr[i]=temp[i];
        }
        for(int i =temp.length;i<n;i++)
        {
            arr[i]=0;
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
