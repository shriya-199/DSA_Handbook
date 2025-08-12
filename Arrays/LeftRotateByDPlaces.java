
import java.util.*;
public class LeftRotateByDPlaces {
    public static void reverse(int[] arr, int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,3,2,5,9};
        int d= sc.nextInt();
        int n = arr.length;
        d=d%n;
        /**Brute Force:
        int[] temp = new int[d];
        for(int i =0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i =d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        int indx=0;
        for(int i=n-d;i<n;i++)
        {
            arr[i]=temp[indx++];
        }*/
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
