import java.util.*;
public class LeftRotateArrayByOnePlace {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp =arr[0];
        for(int i =1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
