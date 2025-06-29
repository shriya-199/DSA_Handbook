import java.util.*;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sdSmallest = 0;
        for(int i =1;i<n;i++)
        {
            if(sdSmallest != arr[i])
            {
                sdSmallest = arr[i];
                break;
            }
        }
        System.out.print(sdSmallest);
    }
}
