import java.util.*;
public class SecondLargestOptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int largest = arr[0];
        int sdLargest = -1;
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i =1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                sdLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sdLargest)
            {
                sdLargest=arr[i];
            }
        }
        System.out.print(sdLargest);
    }
}
// Time Complexity: O(N)