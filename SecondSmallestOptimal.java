import java.util.*;
public class SecondSmallestOptimal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int smallest = Integer.MAX_VALUE;
        int sdSmallest = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++)
        {
            if(smallest>arr[i])
            {
                sdSmallest= smallest;
                smallest= arr[i];
            }
            else if (arr[i]>smallest && arr[i]<sdSmallest) {
                sdSmallest = arr[i];
                
            }


        }
        System.out.print(sdSmallest);
    }
}
