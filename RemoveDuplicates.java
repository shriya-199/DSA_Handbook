import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Set<Integer>st = new HashSet<>();
        for(int i =0;i<n;i++)
        {
            st.add(arr[i]);
        }
        int index =0;
        for(int i :st)
        {
            arr[index]=i;
            index++;
            System.out.print(i);
        }

    }
}
