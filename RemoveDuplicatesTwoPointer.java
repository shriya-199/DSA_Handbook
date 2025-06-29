import java.util.*;
public class RemoveDuplicatesTwoPointer {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i =0;
        for(int j = 1;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        for(int k =0;k<=i;k++)
        {
        System.out.print(arr[k]);
        }
    }
}
// Time Complexity:O(N)