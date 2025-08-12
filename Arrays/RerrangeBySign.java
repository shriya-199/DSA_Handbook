public class RerrangeBySign {
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int n = arr.length;
        /**Brute Force 
        int pIndx =0;
        int nIndx =0;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                negative[nIndx++]=arr[i];
            }
            if(arr[i]>=0)
            {
                positive[pIndx++]=arr[i];
            }
        }
        for(int i =0;i<n/2;i++)
        {
            arr[i*2]=positive[i];
            arr[i*2+1]=negative[i];
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }*/ 
        int pos=0;
        int neg=1;
        int[] ans = new int[n];
        for(int i =0;i<n;i++)
        {
           if (arr[i] >= 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        for(int i: ans)
        {
            System.out.print(i+" ");
        } 

    }
}
