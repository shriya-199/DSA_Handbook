public class RearrangeElementsBySign {
    public static void main(String args[])
    {
        int[] arr ={1,2,-8,-7,1,-25};
        int n = arr.length;
        int[] positive = new int[n];
        int[] negative = new int[n];
        int posIndx = 0;
        int negIndx = 0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>0)
            {
                positive[posIndx++]=arr[i];
            }
            else{
                negative[negIndx++]=arr[i];
            }
        }
        for(int i =0;i<n/2;i++)
        {
            arr[2*i]=positive[i];
            arr[2*i+1]=negative[i];
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
// Time Complexity: O(n)