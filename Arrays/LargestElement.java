
class largest
{
    public static int largest(int[] arr)
    {
        int largest = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        return largest;

    }
}



// Driver Code
public class LargestElement {
    public static void main(String[] args)
    {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        System.out.println("Largest in given array is " + largest.largest(arr));
    }
    
}
