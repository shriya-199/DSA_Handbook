public class MajorityElement {
    public static void main(String args[])
    {
        int[] arr = {1,1, 4, 2, 3};
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            int count =0;
            for(int j=0;j<n;j++)
            {
                if(arr[i] == arr[j]) count++;
            }
            if(count>n/2)
            {
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.println("No Majority Element");

    }
}
// Time Complexity: O(n^2)