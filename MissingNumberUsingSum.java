public class MissingNumberUsingSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = arr.length+1;
        int sum =0;
        int total = (n*(n+1))/2;
        for(int i =0;i<arr.length;i++)
        {
            sum +=arr[i];
        }
        System.out.print(total-sum);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)