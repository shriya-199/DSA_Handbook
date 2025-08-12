

public class MoveZerosToEnd {
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,4,0,7,0,0,0,8,9,0};
        int n = arr.length;
        /**Brute Force
        int indx=0;
        int[] temp=new int[n];
        for(int i =0;i<n;i++)
        {
            if(arr[i]!=0) temp[indx++]=arr[i];
        }
        for(int i =0;i<n;i++)
        {
            arr[i]=temp[i];
        }*/
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++)
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
}
