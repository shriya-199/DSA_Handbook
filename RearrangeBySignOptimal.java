public class RearrangeBySignOptimal {
    public static void main(String[] args) {
        int [] arr = {1, 2, -8, -7, 1, -25};
        int n = arr.length;
        int pos =0;
        int neg =1;
        int [] ans = new int[n];
        for(int i =0;i<n;i++)
        {
            if(arr[i]<0)
            {
                ans[neg]=arr[i];
                neg+=2;
            }
            else{
                ans[pos]=arr[i];
                pos+=2;
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
