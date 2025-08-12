import java.util.*;
public class Colors {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args) {
        int[] arr ={1,0,1,0,1,1,1,0,0,0,2,0,2,2,2,1,2,1,2,0,1,0,1,0,2};
        int n = arr.length;
        /**Brute Force 
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }*/
        /**Better 
        int cntz=0;
        int cnto=0;
        int cntT=0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                cntz++;
            }
            else if(arr[i]==1)
            {
                cnto++;
            }
            else
            {
                cntT++;
            }
        }
        for(int i =0;i<cntz;i++)
        {
            arr[i]=0;
        }
        for(int i = cntz;i<cnto+cntz;i++)
        {
            arr[i]=1;
        }
        for(int i = cnto+cntz;i<arr.length;i++)
        {
            arr[i]=2;
        }*/
        /**Dutch National Flag */
        int low =0;
        int high = n-1;
        int mid=0;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low, mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2)
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
