public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15,0};
        int target = 11;
        boolean found = false;
        for(int i =0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    found = true;
                    System.out.println("Indices: " + i + ", " + j);
                }
            }
        }
         System.out.println(found);
    }
}
// Time Complexity: O(n^2)
